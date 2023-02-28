package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import androidx.activity.result.contract.ActivityResultContracts
import kotlinx.android.synthetic.main.activity_demo.*

class DemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)
        val intent : Intent = Intent(this@DemoActivity,com.acuant.sampleapp.MainActivity::class.java)
        acuantCaptureIntent.launch(intent)
    }

    val acuantCaptureIntent = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        val data: Intent? = result.data
        when (result.resultCode) {
            RESULT_OK -> {
                tv_hello_world.text = data?.getStringExtra("RETURN_TEXT").toString()
            }
            RESULT_CANCELED -> {
                tv_hello_world.text = "fail"
            }
            else -> {
                tv_hello_world.text = "fail"
            }
        }
    }

}