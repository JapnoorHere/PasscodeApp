package com.japnoor.passcodeapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.hanks.passcodeview.PasscodeView
import com.japnoor.passcodeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.passcodeView.setPasscodeLength(5).setLocalPasscode("11111").listener =
            object : PasscodeView.PasscodeViewListener {
                override fun onFail() {
                    TODO("Not yet implemented")
                }

                override fun onSuccess(number: String?) {
                    Toast.makeText(this@MainActivity, "Correct Passcode", Toast.LENGTH_LONG).show()
                }

            }
    }
}