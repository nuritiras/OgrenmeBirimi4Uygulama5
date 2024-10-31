package tr.com.nuritiras.ogrenmebirimi4uygulama5

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
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
    }

    fun onClickOnayla(view: View) {

        val not1= findViewById<EditText>(R.id.editTextNumber_Not1).text.toString().toByte()
        val not2= findViewById<EditText>(R.id.editTextNumber_Not2).text.toString().toByte()
        val not3= findViewById<EditText>(R.id.editTextNumber_Not3).text.toString().toByte()
        val ortalama:Float=(not1+not2+not3)/3.0f

        if (ortalama>=0 && ortalama<25)
            Toast.makeText(this,"O ile kaldınız.",Toast.LENGTH_LONG).show()
        else if (ortalama>=25 && ortalama<50)
            Toast.makeText(this,"1 ile kaldınız.",Toast.LENGTH_LONG).show()
        else if (ortalama>=50 && ortalama<60)
            Toast.makeText(this,"2 ile geçtiniz.",Toast.LENGTH_LONG).show()
        else if (ortalama>=60 && ortalama<70)
            Toast.makeText(this,"3 ile geçtiniz.",Toast.LENGTH_LONG).show()
        else if (ortalama>=70 && ortalama<85)
            Toast.makeText(this,"4 ile geçtiniz.",Toast.LENGTH_LONG).show()
        else if (ortalama>=85 && ortalama<=100)
            Toast.makeText(this,"5 ile geçtiniz.",Toast.LENGTH_LONG).show()
        else
            Toast.makeText(this,"Girilen not bilgileri hatalıdır.",Toast.LENGTH_LONG).show()
    }
}