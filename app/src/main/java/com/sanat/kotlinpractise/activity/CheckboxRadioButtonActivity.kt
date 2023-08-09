package com.sanat.kotlinpractise.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.sanat.kotlinpractise.R

class CheckboxRadioButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkbox_radio_button)

        val actionbar = supportActionBar
        actionbar!!.title = "CheckboxRadio"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
//        val rbMutton = findViewById<RadioButton>(R.id.rbMutton)
//        val rbChicken = findViewById<RadioButton>(R.id.rbChicken)
//        val rbPork = findViewById<RadioButton>(R.id.rbPork)

        val cbCheese = findViewById<CheckBox>(R.id.cbCheese)
        val cbOnion = findViewById<CheckBox>(R.id.cbOnion)
        val cbSalad = findViewById<CheckBox>(R.id.cbSalad)

        val txtResult = findViewById<TextView>(R.id.txtResult)

        val btnOrder = findViewById<Button>(R.id.btnOrder)
        btnOrder.setOnClickListener {
            val checkedMeatRadioButtonId = radioGroup.checkedRadioButtonId
            val meat = findViewById<RadioButton>(checkedMeatRadioButtonId)
            val cheese = cbCheese.isChecked
            val onion = cbOnion.isChecked
            val salad = cbSalad.isChecked
            val orderString = "You ordered a burger with: \n" +
                    "${meat.text}" +
                    (if (cheese) "\nCheese" else "") +
                    (if (onion) "\nOnion" else "") +
                    (if (salad) "\nSalad" else "")
            txtResult.text = orderString
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}