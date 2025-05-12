package pe.edu.calcupeu

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.GridView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var txtVal1:EditText
    lateinit var txtVal2:EditText
    lateinit var resultadoTV:TextView
    var resultado:String=""

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.calc)

        txtVal1=findViewById(R.id.txtNum1)
        txtVal2=findViewById(R.id.txtNum2)
        resultadoTV=findViewById(R.id.txtViewResul)

        var buttons= arrayOf(R.id.btnAdd, R.id.btnSubtract, R.id.btnDivide, R.id.btnMultiply)

        for (b in buttons){
            var button=findViewById<Button>(b)
            button.setOnClickListener { operar(button) }
        }

        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/
    }

    fun operar(view: View){
        when(view.id){
            R.id.btnAdd->{
                resultado= (txtVal1.text.toString().toInt()+txtVal2.text.toString().toInt()).toString()
                resultadoTV.text=resultado
            }
            R.id.btnSubtract->{
                resultado= (txtVal1.text.toString().toInt()-txtVal2.text.toString().toInt()).toString()
                resultadoTV.text=resultado
            }
            R.id.btnMultiply->{
                resultado= (txtVal1.text.toString().toInt()*txtVal2.text.toString().toInt()).toString()
                resultadoTV.text=resultado
            }
            R.id.btnDivide->{
                resultado= (txtVal1.text.toString().toInt()/txtVal2.text.toString().toInt()).toString()
                resultadoTV.text=resultado
            }
        }
    }

}