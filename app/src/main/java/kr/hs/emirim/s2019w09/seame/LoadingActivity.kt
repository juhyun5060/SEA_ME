package kr.hs.emirim.s2019w09.seame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class LoadingActivity : AppCompatActivity() {

    val SPLASH_TIME_OUT : Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading)

        Handler().postDelayed( {
            startActivity(Intent(this, ResultActivity::class.java))
            finish()
        }, SPLASH_TIME_OUT)
    }
}