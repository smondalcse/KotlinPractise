package com.sanat.kotlinpractise.activity

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.sanat.kotlinpractise.R

class AlertDialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)

        val actionbar = supportActionBar
        actionbar!!.title = "Alert Dialog"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val addContactDialog = AlertDialog.Builder(this)
            .setTitle("Add Contact")
            .setMessage("Do you want to add Mr. Sanat to your contact?")
            .setIcon(R.drawable.ic_add_contact)
            .setPositiveButton("Yes"){ _, _ ->
                Toast.makeText(this, "You added the contact", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("No"){ _, _ ->
                Toast.makeText(this, "You don't added the contact", Toast.LENGTH_SHORT).show()
            }.create()

        val btnDialog1 = findViewById<Button>(R.id.btnDialog1)
        btnDialog1.setOnClickListener {
            addContactDialog.show()
        }

        val options = arrayOf("First Item", "Second Item", "Third Item",)
        val singleChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose one of these options")
            .setSingleChoiceItems(options, 0) { _, i ->
                Toast.makeText(this, "You clicked on ${options[i]}", Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Accept"){ _, _ ->
                Toast.makeText(this, "You Accepted", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline"){ _, _ ->
                Toast.makeText(this, "You Declined", Toast.LENGTH_SHORT).show()
            }.create()

        val btnDialog2 = findViewById<Button>(R.id.btnDialog2)
        btnDialog2.setOnClickListener {
            singleChoiceDialog.show()
        }

        val multiChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose one of these options")
            .setMultiChoiceItems(options, booleanArrayOf(false, false, false)) { _, i, checked ->
                if (checked)
                    Toast.makeText(this, "You checked ${options[i]}", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(this, "You un checked ${options[i]}", Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Accept"){ _, _ ->
                Toast.makeText(this, "You Accepted MultiChoice", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline"){ _, _ ->
                Toast.makeText(this, "You Declined MultiChoice", Toast.LENGTH_SHORT).show()
            }.create()

        val btnDialog3 = findViewById<Button>(R.id.btnDialog3)
        btnDialog3.setOnClickListener {
            multiChoiceDialog.show()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}