package kr.hs.emirim.s2019w09.seame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var txtBirth : EditText
    lateinit var txtName : EditText
    lateinit var btnResult : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtBirth.findViewById<EditText>(R.id.txtBirth)
        txtName.findViewById<EditText>(R.id.txtName)
        btnResult.findViewById<Button>(R.id.btnResult)

        btnResult.setOnClickListener {
            intent = Intent(this, LoadingActivity::class.java)
            startActivity(intent)
        }
    }
}