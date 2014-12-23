/**
 * @author ymolodkov
 * @since 0.1
 * @date 11/12/14.
 */


def jarFile = new File('/Users/ymolodkov/temp/jar.text')
def pomFile = new File('/Users/ymolodkov/temp/pom.text')
def jarList = []
def pomMap = [:]

pomFile.eachLine {
    pomMap.put(it.substring(0, it.length() - 4), 0)
    println it;
}

jarFile.eachLine {
    def key = it.substring(0, it.length() - 4)
    def p = pomMap.get(key)
    if (p != null) {
        pomMap.put(key, 1)
    } else {
        jarList.add(p)
    }
}

pomMap.each {
    if (it.value == 0) {
//        println it.key
    }
}

