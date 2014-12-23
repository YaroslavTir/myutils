package scriptruntime
/**
 * @author ymolodkov
 * @since 0.1
 * @date 23/12/14.
 */
abstract class ScriptGroovyParent extends Script{
    def queryThisBaby(name) {
        return  "hi $name"
    }
}