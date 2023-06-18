package com.example.calculadora_android_java

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.calculadora_android_java.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var mBinding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(
            layoutInflater
        )
        setContentView(mBinding!!.root)


        //************************CAMBIOSS*********************
        //El uso de lo !! para referenciar
        //El uso del val para crear constantes
        //El uso del $ para concatenar
        //El cambio de la funcion ParseInt a toInt().
        //*****************************************************

        mBinding!!.add.setOnClickListener {
            val FirstNumber = mBinding!!.FirstNumber.text.toString()
            val SecondNumber = mBinding!!.SecondNumber.text.toString()
            if (FirstNumber.isEmpty()) {
                Toast.makeText(this@MainActivity, "First number empty", Toast.LENGTH_LONG).show()
            }
            if (SecondNumber.isEmpty()) {
                Toast.makeText(this@MainActivity, "Second number empty", Toast.LENGTH_LONG).show()
            }
            if (FirstNumber.isEmpty() == false && SecondNumber.isEmpty() == false) {
                val result = FirstNumber.toInt() + SecondNumber.toInt()
                mBinding!!.result.text = "Result:$result"
            }
        }
        mBinding!!.subtract.setOnClickListener {
            val FirstNumber = mBinding!!.FirstNumber.text.toString()
            val SecondNumber = mBinding!!.SecondNumber.text.toString()
            if (FirstNumber.isEmpty()) {
                Toast.makeText(this@MainActivity, "First number empty", Toast.LENGTH_LONG).show()
            }
            if (SecondNumber.isEmpty()) {
                Toast.makeText(this@MainActivity, "Second number empty", Toast.LENGTH_LONG).show()
            }
            if (FirstNumber.isEmpty() == false && SecondNumber.isEmpty() == false) {
                val result = FirstNumber.toInt() - SecondNumber.toInt()
                mBinding!!.result.text = "Result:$result"
            }
        }
        mBinding!!.divide.setOnClickListener {
            val FirstNumber = mBinding!!.FirstNumber.text.toString()
            val SecondNumber = mBinding!!.SecondNumber.text.toString()
            if (FirstNumber.isEmpty()) {
                Toast.makeText(this@MainActivity, "First number empty", Toast.LENGTH_LONG).show()
            }
            if (SecondNumber.isEmpty()) {
                Toast.makeText(this@MainActivity, "Second number empty", Toast.LENGTH_LONG).show()
            }
            if (FirstNumber.isEmpty() == false && SecondNumber.isEmpty() == false) {
                val result = FirstNumber.toInt() / SecondNumber.toInt()
                mBinding!!.result.text = "Result:$result"
            }
        }
        mBinding!!.multply.setOnClickListener {
            val FirstNumber = mBinding!!.FirstNumber.text.toString()
            val SecondNumber = mBinding!!.SecondNumber.text.toString()
            if (FirstNumber.isEmpty()) {
                Toast.makeText(this@MainActivity, "First number empty", Toast.LENGTH_LONG).show()
            }
            if (SecondNumber.isEmpty()) {
                Toast.makeText(this@MainActivity, "Second number empty", Toast.LENGTH_LONG).show()
            }
            if (FirstNumber.isEmpty() == false && SecondNumber.isEmpty() == false) {
                val result = FirstNumber.toInt() * SecondNumber.toInt()
                mBinding!!.result.text = "Result:$result"
            }
        }
    }
}