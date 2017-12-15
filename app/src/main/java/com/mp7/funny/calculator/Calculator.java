package com.mp7.funny.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;


import com.google.android.gms.ads.MobileAds;

public class Calculator extends AppCompatActivity {
    TextView displayBinary, displayDecimal;
    Button one, zero, clear;
    ImageButton arrow;
    int input, output;
    String inputString, outputString;
    AdView moneyMaker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    MobileAds.initialize(this, "ca-app-pub-2036959971024886~3829715441");
    input = 0;
    inputString = "";
    outputString = "";
    one =  findViewById(R.id.button1);
    zero =  findViewById(R.id.button0);
    clear =  findViewById(R.id.clear);
    displayBinary =  findViewById(R.id.displayBinary);
    displayDecimal = findViewById(R.id.displayDecimal);
    arrow = findViewById(R.id.arrow);
    moneyMaker = findViewById(R.id.adView);
    AdRequest adRequest = new AdRequest.Builder().build();
    moneyMaker.loadAd(adRequest);
    one.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v) {
        inputString = inputString + "1";
        try{
            input = Integer.parseInt(inputString,2);
            outputString = Integer.toString(input);
        }catch(NumberFormatException e){
            outputString = "Overflow: Press clear";
        }

        displayBinary.setText(outputString);
        displayDecimal.setText(inputString);
    }
    });
    zero.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            inputString = inputString + "0";
            try{
                input = Integer.parseInt(inputString,2);
                outputString = Integer.toString(input);
            }catch(NumberFormatException e){
                outputString = "Overflow: Press clear";
            }
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
    arrow.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), Decimal_to_Binary.class);
            startActivity(intent);
        }
    });
    }

}
