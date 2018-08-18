package exampl.com.koindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    val presenter: MyPresenter by inject()
    val anotherPresenter: AnotherPresenter by inject()
    val anotherPresenter1:AnotherPresenter by inject()

    companion object {
        val TAG = "MainActivity"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Log.e(TAG, presenter.sayHello())
        Log.e(TAG, anotherPresenter.sayHello())

        Log.e(TAG, anotherPresenter.hashCode().toString())
        Log.e(TAG, anotherPresenter1.hashCode().toString())
    }
}
