package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.io.Console;

public class MainActivity extends AppCompatActivity {

    //Textview Initiation (For Views and View Results)
    TextView workingsTV;
    TextView resultsTV;

    //Store Here String Control (df must be "", not NULL)
    String workings = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Backend Logic Initiation
        //Coded By Kitsuuuu
        initTextViews();
    }


    //This code Consist of Realtime Click Update
    //Text Initiation, Realtime Update
    private void initTextViews() {
        workingsTV = findViewById(R.id.Result);
        resultsTV = findViewById(R.id.Solution);
    }

    //df here must be 0
    public void setWorkings(String givenValue){
        workings = workings + givenValue;
        workingsTV.setText(workings);
    }

    //Code Lines Initiation Logic
    //Call Logics for Signs and clear
    public void clearTextAll(View view){
        resultsTV.setText("0");
        workingsTV.setText("0");
        workings = "";
    }
    public void clearText(View view){
        workingsTV.setText("0");
        workings = "";
    }
    public void backspaceText(View view){
        //Throw Error and Set to Zero instead
        StringBuffer removetxt = new StringBuffer(workings);
        //Get Current set and Delete one line
        try {
            removetxt.deleteCharAt(removetxt.length() - 1);
        }catch (Exception err){
            //Dn
        }
        //Show Backspace
        //Check if String is Empty Before Proceeding to
        if(removetxt.toString().trim().isEmpty() || removetxt.length() == 0){
            workings = "";
            workingsTV.setText("0");
        }else{
            workings = removetxt.toString();
            workingsTV.setText(removetxt.toString());
        }

    }
    public void multiplyText(View view){
        setWorkings("*");
    }
    public void additionText(View view){
        setWorkings("+");
    }
    public void minusText(View view){
        setWorkings("-");
    }
    public void divideText(View view){
        setWorkings("/");
    }
    public void decimalDotText(View view){
        setWorkings(".");
    }
    public void equalResults(View view){
        //Set Action Taking Equals
        for(int countIt = 0; countIt < workings.length(); countIt++){
            String setTemp = workings.substring(0,countIt);
            Log.e("", setTemp);
        }

    }

    //Call Logics for Numbers
    public void oneText(View view){
        setWorkings("1");
    }
    public void twoText(View view){
        setWorkings("2");
    }
    public void threeText(View view){
        setWorkings("3");
    }
    public void fourText(View view){
        setWorkings("4");
    }
    public void fiveText(View view){
        setWorkings("5");
    }
    public void sixText(View view){
        setWorkings("6");
    }
    public void sevenText(View view){
        setWorkings("7");
    }
    public void eightText(View view){
        setWorkings("8");
    }
    public void nineText(View view){
        setWorkings("9");
    }
    public void zeroText(View view){
        setWorkings("0");
    }
}