package name.kropp.intellij.makefile.toolWindow

import com.intellij.openapi.module.ModuleUtil
import com.intellij.openapi.project.*
import name.kropp.intellij.makefile.*
import javax.swing.tree.*

class MakefileToolWindowOptions(val project: Project) {
  private val settings = project.getService(MakefileProjectSettings::class.java)

  var showSpecialTargets: Boolean
    get() = settings?.settings?.showHiddenInToolWindow ?: false
    set(value) { settings?.settings?.showHiddenInToolWindow = value }

  var autoScrollToSource: Boolean
    get() = settings?.settings?.autoScrollToSourceInToolWindow ?: false
    set(value) { settings?.settings?.autoScrollToSourceInToolWindow = value }

  var sortAlphabetically: Boolean
    get() = settings?.settings?.sortAlphabeticallyInToolWindow ?: false
    set(value) { settings?.settings?.sortAlphabeticallyInToolWindow = value }

  fun getRootNode(): TreeNode {
      val files = MakefileTargetIndex.allTargets(project)
              .filterNot { (it.isSpecialTarget && !showSpecialTargets) || it.isPatternTarget }
              .groupBy { it.containingFile }
              .map {
                  val targets = if (sortAlphabetically) {
                      it.value.map(::MakefileTargetNode).sortedWith(MakefileTreeNode.Comparator)
                  } else {
                      it.value.map(::MakefileTargetNode)
                  }
                  MakefileFileNode(it.key, targets)
              }
              .let {
                  it.sortedWith(compareBy<MakefileFileNode> { it.dir }.thenBy { it.name })
              }
      val modules = files
              .groupBy { ModuleUtil.findModuleForFile(it.psiFile) }
              .map {
                  MakefileModuleNode(it.key, it.value)
              }
              .let {
                  it.sortedBy { it.module?.name }
              }

      return MakefileRootNode(modules)
  }
}