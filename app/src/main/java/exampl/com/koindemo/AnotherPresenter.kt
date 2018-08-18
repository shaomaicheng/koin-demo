package exampl.com.koindemo

/**
 *  create by chenglei at 2018/8/18
 */
class AnotherPresenter(val repository: Repository) {
    fun sayHello() = repository.giveHello()
}