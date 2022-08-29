package com.example.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.splash.databinding.ActivityIntroBinding
import kotlinx.coroutines.delay

class IntroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIntroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.img.animate().translationY(-2600F).setDuration(1000).setStartDelay(4000)
        binding.appName.animate().translationY(1400f).setDuration(1000).setStartDelay(4000)
        binding.logo.animate().translationY(1400F).setDuration(1000).setStartDelay(4000)
        binding.lottie.animate().translationY(1400f).setDuration(1000).setStartDelay(4000)

        binding.img.animate().withEndAction {
            startActivity(Intent(this,MainActivity::class.java))
        }

    }
}