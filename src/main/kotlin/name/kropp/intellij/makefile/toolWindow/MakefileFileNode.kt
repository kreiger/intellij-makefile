package name.kropp.intellij.makefile.toolWindow

import com.intellij.psi.*
import com.intellij.openapi.roots.ProjectRootManager
import com.intellij.openapi.vfs.VfsUtil
import com.intellij.ui.SimpleTextAttributes
import name.kropp.intellij.makefile.*
import java.util.*
import java.util.Collections.*
import javax.swing.*
import javax.swing.tree.*

class MakefileFileNode(val psiFile: PsiFile, private val targets: List<MakefileTargetNode>, val dir: String? = getRelativePathFromContentRoot(psiFile)) : MakefileTreeNode(psiFile.name) {
  init {
    for (target in targets) {
      target.parent = this
    }
  }

  internal lateinit var parent: MakefileModuleNode

  override val icon: Icon
    get() = MakefileIcon

  override fun children(): Enumeration<out TreeNode>? = enumeration(targets)

  override fun isLeaf() = false

  override fun getChildCount() = targets.size

  override fun getParent() = parent

  override fun getChildAt(i: Int) = targets[i]

  override fun getIndex(node: TreeNode) = targets.indexOf(node)

  override fun getAllowsChildren() = true

  override fun renderTo(cellRenderer: MakefileCellRenderer) {
    cellRenderer.append(psiFile.name)
    if (dir != null) {
      cellRenderer.append(" $dir", SimpleTextAttributes.GRAY_SMALL_ATTRIBUTES, false)
    }
  }
}

private fun getRelativePathFromContentRoot(psiFile: PsiFile): String? {
  val projectRootManager = ProjectRootManager.getInstance(psiFile.project)
  val fileIndex = projectRootManager.fileIndex
  val virtualFile = psiFile.virtualFile
  val parent = virtualFile.parent ?: return null
  val contentRootForFile = fileIndex.getContentRootForFile(parent) ?: return null
  return VfsUtil.getRelativePath(parent, contentRootForFile)
}