package com.uluumbch.konvertermatauang

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.uluumbch.konvertermatauang.databinding.ActivityMainBinding
import java.text.NumberFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tombolKonversi.setOnClickListener{ hitungKonversi() }

//        menerapkan fungsi untuk menyembunyikan keyboard
        binding.inputEditText.setOnKeyListener{ view, keyCode, _ ->
            handleKeyEvent(
                view,
                keyCode
            )}
    }

    override fun onSaveInstanceState(savedInstanceState: Bundle) {
        super.onSaveInstanceState(savedInstanceState)

        savedInstanceState.putString("hasil", binding.teksHasil.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        binding.teksHasil.setText(savedInstanceState.getString("hasil"))
    }


    private fun  hitungKonversi(){
        val stringInput = binding.inputEditText.text.toString()
        val uangInput = stringInput.toDoubleOrNull()

        if (uangInput == null){
            binding.teksHasil.text = ""
            return
        }

        val pilihanUser = when (binding.pilihanMataUang.checkedRadioButtonId){
            R.id.euro -> 15617
            R.id.USD -> 14355
            R.id.JPY -> 114
            else -> 3827
        }

        var cetakHasil =  uangInput * pilihanUser

        val indonesianLocale = Locale("in", "ID")
        val hasil_format =
            NumberFormat.getCurrencyInstance(indonesianLocale).format(cetakHasil)

        binding.teksHasil.text = getString(R.string.hasil, hasil_format)
    }


//    fungsi untuk menyembunyikan keyboard
    private fun handleKeyEvent(view: View, keyCode: Int): Boolean {
        if (keyCode == KeyEvent.KEYCODE_ENTER) {
            // Hide the keyboard
            val inputMethodManager =
                getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
            return true
        }
        return false
    }
}