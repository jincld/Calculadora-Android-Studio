package jonathan.orellana.programacionjonathan

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Mandar a llamar a los elementos
        val txtNum1 = findViewById<EditText>(R.id.txtNum1)
        val txtNum2 = findViewById<EditText>(R.id.txtNum2)
        val btnSumar = findViewById<Button>(R.id.btnSumar)

        //Crear objeto de clase Calculadora para con ese objeto llamar a la función sumar

        val objCalculadora  = Calculadora()
        //Programar los elementos

        btnSumar.setOnClickListener {
            objCalculadora.sumar(txtNum1.text.toString().toInt(), txtNum2.text.toString().toInt())
        }

    }
}
