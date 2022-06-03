package com.example.qrcode

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.qrcode.databinding.ActivityResultBinding

/**
 * @author CHOI
 * @email vviian.2@gmail.com
 * @created 2022-06-02
 * @desc
 */
class ResultActivity : AppCompatActivity() {

    lateinit var binding : ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val result = intent.getStringExtra("msg") ?: "데이터가 존재하지 않습니다."

        setUI(result)
    }

    private fun setUI(result: String) {
        binding.tvContent.text = result
        binding.btnGoBack.setOnClickListener {
            finish()
        }
    }
}