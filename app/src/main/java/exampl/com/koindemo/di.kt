package exampl.com.koindemo

import org.koin.dsl.module.Module
import org.koin.dsl.module.applicationContext

/**
 *  create by chenglei at 2018/8/18
 */

val myModule: Module = applicationContext {
    factory { MyPresenter(get()) }
    bean { MyRepository() as Repository }
}

val anotherModule: Module = applicationContext {
    provide(isSingleton = true) { AnotherPresenter(get()) }

    bean {
        AnotherRepository(get()) as Repository
    }
}

val loggerModule = applicationContext {
    factory { MyRepository() }
    bean {
        Logger()
    }
}
