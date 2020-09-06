package name.kropp.intellij.makefile.toolWindow

import com.intellij.openapi.module.Module
import com.intellij.openapi.module.ModuleType
import java.util.*
import javax.swing.Icon
import javax.swing.tree.TreeNode

class MakefileModuleNode(val module : Module?, val files: List<MakefileFileNode>) : MakefileTreeNode(module?.name ?: "") {
    init {
        for (file in files) {
            file.parent = this
        }
    }

    internal lateinit var parent: MakefileRootNode

    override val icon: Icon
        get() = when {
            module != null -> ModuleType.get(module)
            else -> ModuleType.EMPTY
        }.icon

    override fun children(): Enumeration<out TreeNode>? = Collections.enumeration(files)

    override fun isLeaf() = false

    override fun getChildCount() = files.size

    override fun getParent() = parent

    override fun getChildAt(i: Int) = files[i]

    override fun getIndex(node: TreeNode) = files.indexOf(node)

    override fun getAllowsChildren() = true

}
