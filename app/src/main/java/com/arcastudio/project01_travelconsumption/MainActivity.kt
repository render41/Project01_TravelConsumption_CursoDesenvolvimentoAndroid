package com.arcastudio.project01_travelconsumption

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.arcastudio.project01_travelconsumption.databinding.ActivityMainBinding
import java.util.Locale

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        modifyColorStatusBar()
        binding.textLabelTotalCostPrice.text = getString(R.string.price_zero)

        binding.buttonCalculate.setOnClickListener(this)

        binding.editKilometerPerLiter.imeOptions = EditorInfo.IME_ACTION_DONE
        binding.editKilometerPerLiter.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                calculate()
                hideKeyboard(binding.editKilometerPerLiter)
                true
            } else {
                false
            }
        }
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.button_calculate -> calculate()
        }
    }

    private fun calculate() {
        val totalKilometer = binding.editTotalKilometers.text.toString().toFloat()
        val pricePerLiter = binding.editPricePerLiter.text.toString().toFloat()
        val kilometerPerLiter = binding.editKilometerPerLiter.text.toString().toFloat()
        try {
            if (kilometerPerLiter != 0.0f) {
                val totalCostValue = (pricePerLiter * totalKilometer) / kilometerPerLiter

                val formattedTotalCost = String.format(Locale.getDefault(), "%.2f", totalCostValue)
                binding.textLabelTotalCostPrice.text = getString(R.string.total_cost_price, formattedTotalCost).replace('.', ',')
            } else {
                Toast.makeText(
                    this,
                    getString(R.string.kilometer_per_liter) + ". " + getString(R.string.incomplete_edits),
                    Toast.LENGTH_SHORT
                ).show()
            }

        } catch (e: NumberFormatException) {
            when {
                binding.editTotalKilometers.text.toString().isEmpty() -> Toast.makeText(
                    this,
                    getString(R.string.total_kilometers) + ". " + getString(R.string.incomplete_edits),
                    Toast.LENGTH_SHORT
                ).show()

                binding.editPricePerLiter.text.toString().isEmpty() -> Toast.makeText(
                    this,
                    getString(R.string.price_per_liter) + ". " + getString(R.string.incomplete_edits),
                    Toast.LENGTH_SHORT
                ).show()

                binding.editKilometerPerLiter.text.toString().isEmpty() -> Toast.makeText(
                    this,
                    getString(R.string.kilometer_per_liter) + ". " + getString(R.string.incomplete_edits),
                    Toast.LENGTH_SHORT
                ).show()

                else -> Toast.makeText(
                    this,
                    getString(R.string.incomplete_edits),
                    Toast.LENGTH_SHORT
                ).show()
            }

        }
    }

    private fun modifyColorStatusBar() {
        window.statusBarColor = ContextCompat.getColor(this, R.color.green_base)
    }

    private fun hideKeyboard(editText: EditText) {
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(editText.windowToken, 0)
    }
}
