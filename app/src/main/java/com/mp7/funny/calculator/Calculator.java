package com.mp7.funny.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {
    TextView displayBinary, displayDecimal;
    Button one, zero, clear;
    int input, output;
    String inputString, outputString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    input = 0;
    inputString = "";
    outputString = "";
    one =  findViewById(R.id.button1);
    zero =  findViewById(R.id.button0);
    clear =  findViewById(R.id.clear);
    displayBinary =  findViewById(R.id.displayBinary);
    displayDecimal = findViewById(R.id.displayDecimal);
    one.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v) {
            inputString = inputString + "1";
            input = Integer.parseInt(inputString,2);
            outputString = Integer.toString(input);
            displayBinary.setText(outputString);
            displayDecimal.setText(inputString);
        }
    });
    zero.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            inputString = inputString + "0";
            input = Integer.parseInt(inputString,2);
            outputString = Integer.toString(input);
            displayBinary.setText(outputString);
            displayDecimal.setText(inputString);
        }
    });
    clear.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            input = 0b0;
            output = 0b0;
            inputString = "";
            outputString = "";
            displayBinary.setText(outputString);
            displayDecimal.setText(inputString);
        }
    });
    }

}
