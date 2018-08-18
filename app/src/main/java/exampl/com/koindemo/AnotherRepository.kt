package exampl.com.koindemo

/**
 *  create by chenglei at 2018/8/18
 */

class AnotherRepository(val logger: Logger): Repository {
    override fun giveHello(): String {
        logger.e("anotherRepository", "#giveHello()")
        return "hello,Another"
    }
}