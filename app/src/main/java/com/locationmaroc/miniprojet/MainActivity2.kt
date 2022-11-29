package com.locationmaroc.miniprojet

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var textView=findViewById<TextView>(R.id.textView)
        var rr:Button=findViewById(R.id.kk)
        var mode=findViewById<Switch>(R.id.switch1)
        var textmode=findViewById<TextView>(R.id.tt)
        var ff=findViewById<ConstraintLayout>(R.id.laaa)
        var code:EditText=findViewById(R.id.code)
        rr.setOnClickListener{
        if(code?.text.toString()=="0000"){

                var r=Intent(this,MainActivity3::class.java)
                startActivity(r)

        }else if(code?.text.toString()==""){
            Toast.makeText(applicationContext,"Saisir le code d'abonnement",Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText(applicationContext,"Le code est incorrect",Toast.LENGTH_LONG).show()
        }
    }
        /*mode.setOnCheckedChangeListener { compoundButton, isChecked ->
            if(isChecked){
                ff.setBackgroundColor(getColor(android.R.color.background_dark))
                textmode.setTextColor(Color.parseColor("#FFFFFF"))
                code.setTextColor(Color.WHITE)
                code.setHintTextColor(Color.WHITE)
                textView.setTextColor(Color.WHITE)

            }
            else{ ff.setBackgroundColor(getColor(R.color.white))
                textmode.setTextColor(Color.parseColor("#000000"))
                code.setTextColor(Color.BLACK)
                code.setHintTextColor(Color.BLACK)
                textView.setTextColor(Color.BLACK)}
        }*/

    }
}