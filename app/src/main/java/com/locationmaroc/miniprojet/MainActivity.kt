package com.locationmaroc.miniprojet

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var gratuit:Button=findViewById(R.id.gratuit)

        gratuit.setOnClickListener{
            var intent=Intent(this,MainActivity4::class.java)
            startActivity(intent)
        }
        var mode=findViewById<Switch>(R.id.switch1)
        var textmode=findViewById<TextView>(R.id.tt)
        var ff=findViewById<ConstraintLayout>(R.id.laaa)
        var r:Button=findViewById(R.id.paye)
        r.setOnClickListener{
            val intent=Intent(applicationContext,MainActivity2::class.java)
            startActivity(intent)
        }
        mode.setOnCheckedChangeListener { compoundButton, isChecked ->
            if(isChecked){
                ff.setBackgroundColor(getColor(android.R.color.background_dark))
                textmode.setTextColor(Color.parseColor("#FFFFFF"))

            }
            else{ ff.setBackgroundColor(getColor(R.color.white))
            textmode.setTextColor(Color.parseColor("#000000"))}
        }

    }
}