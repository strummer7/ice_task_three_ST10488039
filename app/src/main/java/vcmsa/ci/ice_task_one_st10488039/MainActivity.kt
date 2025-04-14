package vcmsa.ci.ice_task_one_st10488039

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //code starts here
        val editText1 = findViewById<EditText>(R.id.editTextOne)
        val editText2 = findViewById<EditText>(R.id.editTextTwo)
        val textView = findViewById<TextView>(R.id.textAnswer)
        val button = findViewById<Button>(R.id.buttonAddition)

        // add value from edit text one and edit text two when button is pressed
        button.setOnClickListener {
            val num1 = editText1.text.toString().toIntOrNull() ?: 0
            val num2 = editText2.text.toString().toIntOrNull() ?: 0
            val sum = num1+num2
            textView.text = "$sum"
            }
        }
        }
