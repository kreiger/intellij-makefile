package name.kropp.intellij.makefile

import com.intellij.execution.actions.ConfigurationContext
import com.intellij.execution.actions.RunConfigurationProducer
import com.intellij.openapi.util.Ref
import com.intellij.psi.PsiElement
import name.kropp.intellij.makefile.psi.MakefileTarget

class MakefileRunConfigurationProducer : RunConfigurationProducer<MakefileRunConfiguration>(MakefileRunConfigurationType()) {
  override fun setupConfigurationFromContext(configuration : MakefileRunConfiguration, context: ConfigurationContext, sourceElement: Ref<PsiElement>?): Boolean {
    configuration.filename = context.location?.virtualFile?.path ?: ""
    configuration.target = findTarget(context)?.name ?: ""
    configuration.name = configuration.target
    return true
  }

  override fun isConfigurationFromContext(configuration: MakefileRunConfiguration, context: ConfigurationContext): Boolean {
    return configuration.filename == context.location?.virtualFile?.path &&
           configuration.target == findTarget(context)?.name
  }

  private fun findTarget(context: ConfigurationContext): MakefileTarget? {
    var element = context.psiLocation
    while (element != null && element !is MakefileTarget) {
      element = element.parent
    }
    return element as? MakefileTarget
  }
}