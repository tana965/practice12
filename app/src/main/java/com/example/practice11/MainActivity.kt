package com.example.practice11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickAppleRadioButton(view: View){
        val imageFruit : ImageView = findViewById(R.id.imageView)
        imageFruit.setImageResource(R.drawable.apple)
        val radioButtonOther1 : RadioButton = findViewById(R.id.radioButton3)
        val radioButtonOther2 :RadioButton = findViewById(R.id.radioButton2)
        radioButtonOther1.isChecked = false
        radioButtonOther2.isChecked = false
    }
    fun clickPearRadioButton(view: View){
        val imageFruit : ImageView = findViewById(R.id.imageView)
        imageFruit.setImageResource(R.drawable.pear)
        val radioButtonOther1 : RadioButton = findViewById(R.id.radioButton)
        val radioButtonOther2 :RadioButton = findViewById(R.id.radioButton3)
        radioButtonOther1.isChecked = false
        radioButtonOther2.isChecked = false
    }
    fun clickGrapeRadioButton(view: View){
        val imageFruit : ImageView = findViewById(R.id.imageView)
        imageFruit.setImageResource(R.drawable.grape)
        val radioButtonOther1 : RadioButton = findViewById(R.id.radioButton)
        val radioButtonOther2 :RadioButton = findViewById(R.id.radioButton2)
        radioButtonOther1.isChecked = false
        radioButtonOther2.isChecked = false
    }



    fun clickAppleCheckBox(view: View){
        val checkBox :CheckBox = findViewById(R.id.checkBox)
        val imageFruit :ImageView = findViewById(R.id.imageView2)
        if(checkBox.isChecked){
            imageFruit.setImageResource(R.drawable.apple)
        }
        else{
            imageFruit.setImageResource(0)
        }
    }
    fun clickPearCheckBox(view: View){
        val checkBox :CheckBox = findViewById(R.id.checkBox2)
        val imageFruit :ImageView = findViewById(R.id.imageView3)
        if(checkBox.isChecked){
            imageFruit.setImageResource(R.drawable.pear)
        }
        else{
            imageFruit.setImageResource(0)
        }
    }
    fun clickGrapeCheckBox(view: View){
        val checkBox :CheckBox = findViewById(R.id.checkBox3)
        val imageFruit :ImageView = findViewById(R.id.imageView4)
        if(checkBox.isChecked){
            imageFruit.setImageResource(R.drawable.grape)
        }
        else{
            imageFruit.setImageResource(0)
        }
    }




/*fun onRadioButtonClicked(view:View){
        val image:ImageView=findViewById(R.id.imageView)
        val btn1:RadioButton=findViewById(R.id.radioButton)
        val btn2:RadioButton=findViewById(R.id.radioButton2)
        val btn3:RadioButton=findViewById(R.id.radioButton3)
        if(btn1.isChecked){
            image.setImageResource(R.drawable.apple);
            btn2.isChecked=false
            btn3.isChecked=false
        }
        else if(btn2.isChecked){
            image.setImageResource(R.drawable.pear);
            btn1.isChecked=false
            btn3.isChecked=false
        }
        else if(btn3.isChecked){
            image.setImageResource(R.drawable.grape);
            btn1.isChecked=false
            btn2.isChecked=false
        }
    }*/

}