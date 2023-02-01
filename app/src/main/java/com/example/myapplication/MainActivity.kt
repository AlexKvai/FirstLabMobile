package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button1);
        val button2 = findViewById<Button>(R.id.button2);
        val button3 = findViewById<Button>(R.id.button3);
        val button4 = findViewById<Button>(R.id.button4);
        val button5 = findViewById<Button>(R.id.button5);
        val button6 = findViewById<Button>(R.id.button6);
        val button7 = findViewById<Button>(R.id.button7);
        val button8 = findViewById<Button>(R.id.button8);
        val button9 = findViewById<Button>(R.id.button9);
        val button10 = findViewById<Button>(R.id.button10);
        val button11 = findViewById<Button>(R.id.button11);
        val button12 = findViewById<Button>(R.id.button12);
        val button13 = findViewById<Button>(R.id.button13);
        val button14 = findViewById<Button>(R.id.button14);
        val button15 = findViewById<Button>(R.id.button15);
        val button16 = findViewById<Button>(R.id.button16);
        val textView = findViewById<TextView>(R.id.textView)


            var num = arrayListOf<Long>(0,0,0);
            var i = 0;
            var err = "Error";
            var temp: String? = null;

            button.setOnClickListener{
                num[i]=num[i]*10+1;
                textView.text = num[i].toString();
            }
            button2.setOnClickListener{
                num[i]=num[i]*10+2;
                textView.text = num[i].toString();
            }
            button3.setOnClickListener{
                num[i]=num[i]*10+3;
                textView.text = num[i].toString();
            }
            button4.setOnClickListener{
                num[i]=num[i]*10+4;
                textView.text = num[i].toString();
            }
            button5.setOnClickListener{
                num[i]=num[i]*10+5;
                textView.text = num[i].toString();
            }
            button6.setOnClickListener{
                num[i]=num[i]*10+6;
                textView.text = num[i].toString();
            }
            button7.setOnClickListener{
                num[i]=num[i]*10+7;
                textView.text = num[i].toString();
            }
            button8.setOnClickListener{
                num[i]=num[i]*10+8;
                textView.text = num[i].toString();
            }
            button9.setOnClickListener{
                num[i]=num[i]*10+9;
                textView.text = num[i].toString();
            }
            button10.setOnClickListener{
                num[i]=num[i]*10+0;
                textView.text = num[i].toString();
            }
            button11.setOnClickListener{
                temp="-";
                i=1;
                textView.text = "0";
            }
            button12.setOnClickListener{
                temp="+";
                i=1;
                textView.text = "0";
            }
            button13.setOnClickListener{
                temp="*";
                i=1;
                textView.text = "0";
            }
            button14.setOnClickListener{
                var divRes: Double = 0.0;
                i = 0;
                when(temp) {
                    "+" -> num[2] = num[0] + num[1]
                    "-" -> num[2] = num[0] - num[1]
                    "*" -> num[2] = num[0] * num[1]
                    "/" -> if (num[1] != 0L)
                        if (num[0]%num[1] != 0L)
                            divRes = num[0].toDouble() / num[1].toDouble()
                        else num[2] = num[0] / num[1]
                }
                if (num[1] != 0L)
                    if (num[2] ==0L)
                        textView.text = divRes.toString()
                    else textView.text = num[2].toString();
                else textView.text = err
            }
            button15.setOnClickListener{
                num[0]=0;
                num[1]=0;
                num[2]=0;
                textView.text = "0";
            }
            button16.setOnClickListener{
                temp="/";
                i=1;
                textView.text = "0";
            }

    }
}