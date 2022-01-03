package br.com.borges.lucas.gastodeviagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.borges.lucas.gastodeviagem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    binding.buttonCalculate.setOnClickListener{
      calculate()
    }
  }

  private fun calculate() {

  }
}