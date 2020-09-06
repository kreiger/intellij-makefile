package name.kropp.intellij.makefile.toolWindow

import name.kropp.intellij.makefile.*
import java.util.*
import java.util.Collections.*
import javax.swing.*
import javax.swing.tree.*

class MakefileRootNode(private val modules: List<MakefileModuleNode>) : MakefileTreeNode("make") {
  init {
    for (module in modules) {
      module.parent = this
    }
  }

  override val icon: Icon
    get() = MakefileIcon

  override fun children(): Enumeration<MakefileModuleNode> = enumeration(modules)

  override fun isLeaf() = false

  override fun getChildCount() = modules.size

  override fun getParent() = null

  override fun getChildAt(i: Int) = modules[i]

  override fun getIndex(node: TreeNode) = modules.indexOf(node)

  override fun getAllowsChildren() = true
}