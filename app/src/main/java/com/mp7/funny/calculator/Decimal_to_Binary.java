package com.mp7.funny.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Decimal_to_Binary extends AppCompatActivity {

    TextView displayBinary, displayDecimal;
    Button nine, eight, seven, six, five, four, three, two, one, zero, clear;
    ImageButton arrow;
    int input, output;
    String inputString, outputString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decimal_to__binary);
        input = 0;
        inputString = "";
        outputString = "";
        one =  findViewById(R.id.button1);
        zero =  findViewById(R.id.button0);
        two = findViewById(R.id.button2);
        three = findViewById(R.id.button3);
        four = findViewById(R.id.button4);
        five = findViewById(R.id.button5);
        six = findViewById(R.id.button6);
        seven = findViewById(R.id.button7);
        eight = findViewById(R.id.button8);
        nine = findViewById(R.id.button9);

        clear =  findViewById(R.id.clear);
        displayBinary =  findViewById(R.id.displayBinary);
        displayDecimal = findViewById(R.id.displayDecimal);
        arrow = findViewById(R.id.arrow);

        one.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                inputString = inputString + "1";
                try{
                    input = Integer.parseInt(inputString);
                    outputString = Integer.toBinaryString(input);

                }catch(NumberFormatException e){
                    outputString = "Overflow: Press Clear";
                }
                displayBinary.setText(inputString);
                displayDecimal.setText(outputString);
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString = inputString + "0";
                try{
                    input = Integer.parseInt(inputString);
                    outputString = Integer.toBinaryString(input);

                }catch(NumberFormatException e){
                    outputString = "Overflow: Press Clear";
                }
                displayBinary.setText(inputString);
                displayDecimal.setText(outputString);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString = inputString + "2";
                try{
                    input = Integer.parseInt(inputString);
                    outputString = Integer.toBinaryString(input);

                }catch(NumberFormatException e){
                    outputString = "Overflow: Press Clear";
                }
                displayBinary.setText(inputString);
                displayDecimal.setText(outputString);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString = inputString + "3";
                try{
                    input = Integer.parseInt(inputString);
                    outputString = Integer.toBinaryString(input);

                }catch(NumberFormatException e){
                    outputString = "Overflow: Press Clear";
                }
                displayBinary.setText(inputString);
                displayDecimal.setText(outputString);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString = inputString + "4";
                try{
                    input = Integer.parseInt(inputString);
                    outputString = Integer.toBinaryString(input);

                }catch(NumberFormatException e){
                    outputString = "Overflow: Press Clear";
                }
                displayBinary.setText(inputString);
                displayDecimal.setText(outputString);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString = inputString + "5";
                try{
                    input = Integer.parseInt(inputString);
                    outputString = Integer.toBinaryString(input);

                }catch(NumberFormatException e){
                    outputString = "Overflow: Press Clear";
                }
                displayBinary.setText(inputString);
                displayDecimal.setText(outputString);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString = inputString + "6";
                try{
                    input = Integer.parseInt(inputString);
                    outputString = Integer.toBinaryString(input);

                }catch(NumberFormatException e){
                    outputString = "Overflow: Press Clear";
                }
                displayBinary.setText(inputString);
                displayDecimal.setText(outputString);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString = inputString + "7";
                try{
                    input = Integer.parseInt(inputString);
                    outputString = Integer.toBinaryString(input);

                }catch(NumberFormatException e){
                    outputString = "Overflow: Press Clear";
                }
                displayBinary.setText(inputString);
                displayDecimal.setText(outputString);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString = inputString + "8";
                try{
                    input = Integer.parseInt(inputString);
                    outputString = Integer.toBinaryString(input);

                }catch(NumberFormatException e){
                    outputString = "Overflow: Press Clear";
                }
                displayBinary.setText(inputString);
                displayDecimal.setText(outputString);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString = inputString + "9";
                try{
                    input = Integer.parseInt(inputString);
                    outputString = Integer.toBinaryString(input);

                }catch(NumberFormatException e){
                    outputString = "Overflow: Press Clear";
                }
                displayBinary.setText(inputString);
                displayDecimal.setText(outputString);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = 0b0;
                output = 0b0;
                inputString = "";
                outputString = "";
                displayBinary.setText(inputString);
                displayDecimal.setText(outputString);
            }
        });
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Calculator.class);
                startActivity(intent);
            }
        });
    }
}
