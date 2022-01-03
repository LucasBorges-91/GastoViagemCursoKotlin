package br.com.borges.lucas.gastodeviagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.borges.lucas.gastodeviagem.databinding.ActivityMainBinding
import java.lang.NumberFormatException

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
    if ( validation() ) {
      try {
        val distance = binding.editDistance.text.toString().toFloat()
        val price = binding.editPrice.text.toString().toFloat()
        val autonomy = binding.editAutonomy.text.toString().toFloat()
        val totalValue = ( distance * price ) / autonomy
        binding.textTotalValue.text = "R$ ${"%.2f".format( totalValue )}"
      } catch ( ex: NumberFormatException ) {
        Toast.makeText( this, "informe valores maiores que 0", Toast.LENGTH_LONG ).show()
      }
    } else {
      Toast.makeText( this, "Preencha todos os campos", Toast.LENGTH_LONG ).show()
    }
  }

  private fun validation() = ( binding.editDistance.text.toString() != ""
      && binding.editDistance.text.toString().toFloat() > 0
      && binding.editPrice.text.toString() != ""
      && binding.editPrice.text.toString().toFloat() > 0
      && binding.editAutonomy.text.toString() != ""
      && binding.editAutonomy.text.toString().toFloat() > 0 )
}