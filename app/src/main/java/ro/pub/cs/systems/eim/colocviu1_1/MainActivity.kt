package ro.pub.cs.systems.eim.colocviu1_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var tvOutput: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setăm layout-ul XML creat anterior
        setContentView(R.xml.activity_colocviu1_1_main)

        // Inițializăm TextView pentru a afișa textul apăsat
        tvOutput = findViewById(R.id.tv_output)

        // Configurăm butoanele pentru punctele cardinale
        val btnNorth = findViewById<Button>(R.id.btn_north)
        val btnSouth = findViewById<Button>(R.id.btn_south)
        val btnEast = findViewById<Button>(R.id.btn_east)
        val btnWest = findViewById<Button>(R.id.btn_west)
        val btnNavigate = findViewById<Button>(R.id.btn_navigate)

        // Setăm un listener de click pentru fiecare buton
        btnNorth.setOnClickListener { appendText("North") }
        btnSouth.setOnClickListener { appendText("South") }
        btnEast.setOnClickListener { appendText("East") }
        btnWest.setOnClickListener { appendText("West") }

        // Buton pentru a naviga la a doua activitate
        btnNavigate.setOnClickListener {
            val intent = Intent(this, SecondaryActivity::class.java)
            startActivity(intent)
        }
    }

    // Funcție pentru a actualiza TextView cu textul butoanelor apăsate
    private fun appendText(direction: String) {
        val currentText = tvOutput.text.toString()
        tvOutput.text = "$currentText $direction"
    }
}
