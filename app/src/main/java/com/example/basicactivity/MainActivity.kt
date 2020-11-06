package com.example.basicactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnKirim.setOnClickListener {
            kirimPesan(txtPesan.text.toString())
        }

        btnDialog.setOnClickListener {
            tampilDialog()
        }

        Log.i("On Create", "Running On Create")
    }

    override fun onStart() {
        super.onStart()
        Log.i("On Start", "Running On Start")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("On Restart", "Running On Restart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("On Resume", "Running On Resume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("On Pause", "Running On Pause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("On Stop", "Running On Stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("On Destroy", "Running On Destroy")
    }

    fun tampilDialog() {
        val dialog = TestDialog();
        dialog.show(supportFragmentManager, "Sign In")
    }

    fun kirimPesan(isipesan : String) {
        val pesan = Intent().apply {
            action = Intent.ACTION_SEND
            type = "text/plain"
            putExtra(Intent.EXTRA_TEXT, isipesan)
        }
        startActivity(pesan)
    }
}