package br.com.borges.lucas.gastodeviagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.borges.lucas.gastodeviagem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.buttonCalculate.setOnClickListener{
      calculate()
    }
  }

  private fun calculate() {
    val distance = binding.editDistance.text.toString().toFloat()
    val price = binding.editPrice.text.toString().toFloat()
    val autonomy = binding.editAutonomy.text.toString().toFloat()

    val totalValue = ( distance * price ) / autonomy
    binding.textTotalValue.text = "R$ ${"%.2f".format( totalValue )}"

  }
}