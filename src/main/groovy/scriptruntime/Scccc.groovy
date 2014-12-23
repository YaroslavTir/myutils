package scriptruntime
/**
 * @author ymolodkov
 * @since 0.1
 * @date 23/12/14.
 */
import org.codehaus.groovy.control.CompilerConfiguration

def configuration = new CompilerConfiguration()
configuration.setScriptBaseClass("scriptruntime.ScriptGroovyParent")

def shell = new GroovyShell(this.class.classLoader, new Binding(), configuration)

println shell.evaluate("queryThisBaby('Bond')")