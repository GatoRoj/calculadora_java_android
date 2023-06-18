package com.example.calculadora_android_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.calculadora_android_java.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        // busco elementos

        //mBinding.Name.setText("JOSE PEÑA");

        mBinding.add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String FirstNumber = mBinding.FirstNumber.getText().toString();
                String SecondNumber = mBinding.SecondNumber.getText().toString();

                if(FirstNumber.isEmpty()){
                    Toast.makeText(MainActivity.this, "First number empty",Toast.LENGTH_LONG).show();
                }
                if(SecondNumber.isEmpty()){
                    Toast.makeText(MainActivity.this, "Second number empty",Toast.LENGTH_LONG).show();
                }
                if( FirstNumber.isEmpty() == false && SecondNumber.isEmpty() ==false){
                    int result = Integer.parseInt(FirstNumber) + Integer.parseInt(SecondNumber);
                    mBinding.result.setText("Result:"+result);
                }

            }
        });
        mBinding.subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String FirstNumber = mBinding.FirstNumber.getText().toString();
                String SecondNumber = mBinding.SecondNumber.getText().toString();

                if(FirstNumber.isEmpty()){
                    Toast.makeText(MainActivity.this, "First number empty",Toast.LENGTH_LONG).show();
                }
                if(SecondNumber.isEmpty()){
                    Toast.makeText(MainActivity.this, "Second number empty",Toast.LENGTH_LONG).show();
                }
                if( FirstNumber.isEmpty() == false && SecondNumber.isEmpty() ==false){
                    int result = Integer.parseInt(FirstNumber) - Integer.parseInt(SecondNumber);
                    mBinding.result.setText("Result:"+result);
                }

            }
        });
        mBinding.divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String FirstNumber = mBinding.FirstNumber.getText().toString();
                String SecondNumber = mBinding.SecondNumber.getText().toString();

                if(FirstNumber.isEmpty()){
                    Toast.makeText(MainActivity.this, "First number empty",Toast.LENGTH_LONG).show();
                }
                if(SecondNumber.isEmpty()){
                    Toast.makeText(MainActivity.this, "Second number empty",Toast.LENGTH_LONG).show();
                }
                if( FirstNumber.isEmpty() == false && SecondNumber.isEmpty() ==false){
                    int result = Integer.parseInt(FirstNumber) / Integer.parseInt(SecondNumber);
                    mBinding.result.setText("Result:"+result);
                }

            }
        });
        mBinding.multply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String FirstNumber = mBinding.FirstNumber.getText().toString();
                String SecondNumber = mBinding.SecondNumber.getText().toString();

                if(FirstNumber.isEmpty()){
                    Toast.makeText(MainActivity.this, "First number empty",Toast.LENGTH_LONG).show();
                }
                if(SecondNumber.isEmpty()){
                    Toast.makeText(MainActivity.this, "Second number empty",Toast.LENGTH_LONG).show();
                }
                if( FirstNumber.isEmpty() == false && SecondNumber.isEmpty() ==false){
                    int result = Integer.parseInt(FirstNumber) * Integer.parseInt(SecondNumber);
                    mBinding.result.setText("Result:"+result);
                }

            }
        });

    }
}