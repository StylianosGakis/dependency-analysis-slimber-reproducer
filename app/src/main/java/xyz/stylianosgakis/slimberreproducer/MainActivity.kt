package xyz.stylianosgakis.slimberreproducer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import e
import timber.log.Timber
import timber.log.Timber.DebugTree

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.plant(DebugTree())
        setContentView(R.layout.activity_main)
        e { "" }
//        e(Throwable()) // uncomment this and run `./gradlew :app:projectHealth` again and it will no longer suggest to remove it since it's not an inline function.
    }
}
