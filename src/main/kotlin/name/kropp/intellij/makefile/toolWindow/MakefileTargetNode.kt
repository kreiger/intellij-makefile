package name.kropp.intellij.makefile.toolWindow

import com.intellij.ui.SimpleTextAttributes.REGULAR_ATTRIBUTES
import com.intellij.ui.SimpleTextAttributes.REGULAR_ITALIC_ATTRIBUTES
import name.kropp.intellij.makefile.*
import name.kropp.intellij.makefile.psi.*
import java.util.*
import javax.swing.*
import javax.swing.tree.*

class MakefileTargetNode(val target: MakefileTarget) : MakefileTreeNode(target.name) {
  override val icon: Icon
    get() = MakefileTargetIcon

  internal lateinit var parent: MakefileFileNode

  override fun children(): Enumeration<out TreeNode>? = null

  override fun isLeaf() = true

  override fun getChildCount() = 0

  override fun getParent() = parent

  override fun getChildAt(i: Int) = null

  override fun getIndex(node: TreeNode) = 0

  override fun getAllowsChildren() = false

  override fun renderTo(cellRenderer: MakefileCellRenderer) {
    cellRenderer.append(name, when {
        target.isSpecialTarget -> REGULAR_ITALIC_ATTRIBUTES
        else -> REGULAR_ATTRIBUTES
    })
  }

}