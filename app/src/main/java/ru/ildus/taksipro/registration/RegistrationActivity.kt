package ru.ildus.taksipro.registration

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.ildus.taksipro.R
import ru.ildus.taksipro.databinding.RegistrMainBinding

class RegistrationActivity : AppCompatActivity() {
    lateinit var binding: RegistrMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = RegistrMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    override fun onStart() {
        super.onStart()
        supportFragmentManager.beginTransaction()
            .add(R.id.container, RegistrFragment())
            .commit()
    }
}