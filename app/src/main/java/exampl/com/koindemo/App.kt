package exampl.com.koindemo

import android.app.Application
import org.koin.standalone.StandAloneContext.startKoin

/**
 *  create by chenglei at 2018/8/18
 */
class App : Application() {
    override fun onCreate() {

        super.onCreate()
//        startKoin(this, listOf(myModule, presenterModule))
        startKoin(listOf(myModule, anotherModule, loggerModule))
    }
}