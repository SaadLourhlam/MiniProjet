package com.locationmaroc.miniprojet

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        /*var mode=findViewById<Switch>(R.id.switch1)
        var textmode=findViewById<TextView>(R.id.tt)
        var ff=findViewById<ConstraintLayout>(R.id.laaa)*/
        var e:TextView=findViewById(R.id.er)
        var un: Button =findViewById(R.id.b1)
        var deux: Button =findViewById(R.id.b2)
        var trois: Button =findViewById(R.id.b3)
        var quatre: Button =findViewById(R.id.b4)
        var cinq: Button =findViewById(R.id.b5)
        var six: Button =findViewById(R.id.b6)
        var sept: Button =findViewById(R.id.b9)
        var huit: Button =findViewById(R.id.b8)
        var neuf: Button =findViewById(R.id.b9)
        var zero: Button =findViewById(R.id.b0)
        var plus: Button =findViewById(R.id.plus)
        var moins: Button =findViewById(R.id.moins)
        var div: Button =findViewById(R.id.division)
        var modulo: Button =findViewById(R.id.modulo)
        var multi: Button =findViewById(R.id.multiplication)
        var vider: Button =findViewById(R.id.vider)
        var egal: Button =findViewById(R.id.egal)

        /*mode.setOnCheckedChangeListener { compoundButton, isChecked ->
            if(isChecked){
                ff.setBackgroundColor(getColor(android.R.color.background_dark))
                textmode.setTextColor(Color.parseColor("#FFFFFF"))

            }
            else{ ff.setBackgroundColor(getColor(R.color.white))
                textmode.setTextColor(Color.parseColor("#000000"))}
        }*/


        var n1=""
        var n2=""
        var operation=""
        var affiche=""


        un.setOnClickListener{
            if((n1=="")||(operation=="")){
                n1+="1"
            }else{
                n2+="1"
            }
            affiche+="1"
            e.setText(affiche.toString())
        }
        deux.setOnClickListener{
            if((n1=="")||(operation=="")){
                n1+="2"
            }else{
                n2+="2"
            }
            affiche+="2"
            e.setText(affiche.toString())
        }
        trois.setOnClickListener{
            if((n1=="")||(operation=="")){
                n1+="3"
            }else{
                n2+="3"
            }
            affiche+="3"
            e.setText(affiche.toString())
        }
        quatre.setOnClickListener{
            if((n1=="")||(operation=="")){
                n1+="4"
            }else{
                n2+="4"
            }
            affiche+="4"
            e.setText(affiche.toString())
        }
        cinq.setOnClickListener{
            if((n1=="")||(operation=="")){
                n1+="5"
            }else{
                n2+="5"
            }
            affiche+="5"
            e.setText(affiche.toString())
        }
        six.setOnClickListener{
            if((n1=="")||(operation=="")){
                n1+="6"
            }else{
                n2+="6"
            }
            affiche+="6"
            e.setText(affiche.toString())
        }
        sept.setOnClickListener{
            if((n1=="")||(operation=="")){
                n1+="7"
            }else{
                n2+="7"
            }
            affiche+="7"
            e.setText(affiche.toString())
        }
        huit.setOnClickListener{
            if((n1=="")||(operation=="")){
                n1+="8"
            }else{
                n2+="8"
            }
            affiche+="8"
            e.setText(affiche.toString())
        }
        neuf.setOnClickListener{
            if((n1=="")||(operation=="")){
                n1+="9"
            }else{
                n2+="9"
            }
            affiche+="9"
            e.setText(affiche.toString())
        }
        zero.setOnClickListener{
            if((n1=="")||(operation=="")){
                n1+="0"
            }else{
                n2+="0"
            }
            affiche+="0"
            e.setText(affiche.toString())
        }
        plus.setOnClickListener{
            if(operation!=""){
                var a=n1.toString().toDouble()
                var b=n2.toString().toDouble()
                var resultat=0.0
                if(operation=="+"){

                    resultat=a+b

                }else if(operation=="-"){

                    resultat=a-b

                }else if(operation=="*"){

                    resultat=a*b

                }else if(operation=="/"){

                    resultat=a/b

                }else if(operation=="%"){

                    resultat=a%b

                }
                n2=""
                operation=""
                n1=resultat.toString()
                affiche=n1.toString()
                e.setText(affiche.toString())
            }else{
                operation="+"
                affiche+="+"
                e.setText(affiche.toString())
            }

        }
        moins.setOnClickListener{
            if(operation!=""){
                var a=n1.toString().toDouble()
                var b=n2.toString().toDouble()
                var resultat=0.0
                if(operation=="+"){

                    resultat=a+b

                }else if(operation=="-"){

                    resultat=a-b

                }else if(operation=="*"){

                    resultat=a*b

                }else if(operation=="/"){

                    resultat=a/b

                }else if(operation=="%"){

                    resultat=a%b

                }
                n2=""
                operation=""
                n1=resultat.toString()
                affiche=n1.toString()
                e.setText(affiche.toString())
            }else{
                operation="-"
                affiche+="-"
                e.setText(affiche.toString())
            }
        }
        div.setOnClickListener{
            if(operation!=""){
                var a=n1.toString().toDouble()
                var b=n2.toString().toDouble()
                var resultat=0.0
                if(operation=="+"){

                    resultat=a+b

                }else if(operation=="-"){

                    resultat=a-b

                }else if(operation=="*"){

                    resultat=a*b

                }else if(operation=="/"){

                    resultat=a/b

                }else if(operation=="%"){

                    resultat=a%b

                }
                n2=""
                operation=""
                n1=resultat.toString()
                affiche=n1.toString()
                e.setText(affiche.toString())
            }else{
                operation="/"
                affiche+="/"
                e.setText(affiche.toString())
            }
        }
        modulo.setOnClickListener{
            if(operation!=""){
                var a=n1.toString().toDouble()
                var b=n2.toString().toDouble()
                var resultat=0.0
                if(operation=="+"){

                    resultat=a+b

                }else if(operation=="-"){

                    resultat=a-b

                }else if(operation=="*"){

                    resultat=a*b

                }else if(operation=="/"){

                    resultat=a/b

                }else if(operation=="%"){

                    resultat=a%b

                }
                n2=""
                operation=""
                n1=resultat.toString()
                affiche=n1.toString()
                e.setText(affiche.toString())
            }else{
                operation="%"
                affiche+="%"
                e.setText(affiche.toString())
            }
        }

        multi.setOnClickListener{
            if(operation!=""){
                var a=n1.toString().toDouble()
                var b=n2.toString().toDouble()
                var resultat=0.0
                if(operation=="+"){

                    resultat=a+b

                }else if(operation=="-"){

                    resultat=a-b

                }else if(operation=="*"){

                    resultat=a*b

                }else if(operation=="/"){

                    resultat=a/b

                }else if(operation=="%"){

                    resultat=a%b

                }
                n2=""
                operation=""
                n1=resultat.toString()
                affiche=n1.toString()
                e.setText(affiche.toString())
            }else{
                operation="*"
                affiche+="*"
                e.setText(affiche.toString())
            }
        }


        egal.setOnClickListener{
            var a=n1.toString().toDouble()
            var b=n2.toString().toDouble()
            var resultat=0.0
            if(operation=="+"){

                resultat=a+b

            }else if(operation=="-"){

                resultat=a-b

            }else if(operation=="*"){

                resultat=a*b

            }else if(operation=="/"){

                resultat=a/b

            }else if(operation=="%"){

                resultat=a%b

            }
            n2=""
            operation=""
            n1=resultat.toString()
            affiche=n1.toString()
            e.setText(affiche.toString())
        }
        vider.setOnClickListener{
            n1=""
            n2=""
            affiche=""
            e.setText(affiche.toString())
        }







    }
}