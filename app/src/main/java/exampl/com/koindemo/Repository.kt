package exampl.com.koindemo

/**
 *  create by chenglei at 2018/8/18
 */
interface Repository {
    fun giveHello(): String
}

class MyRepository : Repository {
    override fun giveHello() = "Hello Koin"
}