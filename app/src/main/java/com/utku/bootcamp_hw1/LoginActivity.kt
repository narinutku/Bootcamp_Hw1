package com.utku.bootcamp_hw1

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import com.utku.bootcamp_hw1.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    var visibility: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnChangeVisibility.setOnClickListener {
            if (visibility) {
                binding.etPassword.transformationMethod = PasswordTransformationMethod.getInstance()
                binding.btnChangeVisibility.setImageResource(R.drawable.ic_baseline_visibility_24)
                binding.etPassword.setSelection(binding.etPassword.text.length)
                visibility = false
            } else {
                binding.etPassword.transformationMethod =
                    HideReturnsTransformationMethod.getInstance()
                binding.btnChangeVisibility.setImageResource(R.drawable.ic_baseline_visibility_off_24)
                binding.etPassword.setSelection(binding.etPassword.text.length)
                visibility = true
            }
        }
        binding.btnLogin.setOnClickListener {
            if (isValid()) {
                val intent = Intent(this, ProductListActivity::class.java)
                startActivity(intent)
                finish()

            } else {
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Hatalı Giriş!")
                builder.setMessage("Kullanıcı adı veya şifre yanlış lütfen tekrar deneyiniz.")
                builder.setIcon(android.R.drawable.ic_dialog_alert)
                builder.setNeutralButton("Kapat") { dialog, id ->
                    dialog.dismiss()
                }
                builder.show()


            }
        }
        binding.btnLoginWithoutMembership.setOnClickListener {
            val intent = Intent(this, ProductListActivity::class.java)
            intent.putExtra("login",false)
            startActivity(intent)
            finish()
        }

    }

    private fun isValid() =
        binding.etPhone.text.toString() == "01111111111" && binding.etPassword.text.toString() == "#e&it1m"
}