package com.example.minicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public String num1 = "";
    public String num2 = "";

    public String sign = "";
    public String res = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void delAll(View view) {
        TextView getRes = findViewById(R.id.display);
        getRes.setText("0");
        num1 = num2 = sign = res = "";
    }
    public void getZero(View view){
        TextView displayNum = findViewById(R.id.display);
        if (sign.equals("")){
            num1 += "0";
            displayNum.setText(num1);
        }else {
            num2 += "0";
            displayNum.setText(num2);
        }
    }
    public void getOne(View view) {
        TextView displayNum = findViewById(R.id.display);
        if (sign.equals("")){
            num1 += "1";
            displayNum.setText(num1);
        }else {
            num2 += "1";
            displayNum.setText(num2);
        }
    }
    public void getTwo(View view) {
        TextView displayNum = findViewById(R.id.display);
        if (sign.equals("")){
            num1 += "2";
            displayNum.setText(num1);
        }else {
            num2 += "2";
            displayNum.setText(num2);
        }
    }
    public void getThree(View view) {
        TextView displayNum = findViewById(R.id.display);
        if (sign.equals("")){
            num1 += "3";
            displayNum.setText(num1);
        }else {
            num2 += "3";
            displayNum.setText(num2);
        }
    }
    public void getFour(View view) {
        TextView displayNum = findViewById(R.id.display);
        if (sign.equals("")){
            num1 += "4";
            displayNum.setText(num1);
        }else {
            num2 += "4";
            displayNum.setText(num2);
        }
    }
    public void getFive(View view) {
        TextView displayNum = findViewById(R.id.display);
        if (sign.equals("")){
            num1 += "5";
            displayNum.setText(num1);
        }else {
            num2 += "5";
            displayNum.setText(num2);
        }
    }
    public void getSix(View view) {
        TextView displayNum = findViewById(R.id.display);
        if (sign.equals("")){
            num1 += "6";
            displayNum.setText(num1);
        }else {
            num2 += "6";
            displayNum.setText(num2);
        }
    }
    public void getSeven(View view) {
        TextView displayNum = findViewById(R.id.display);
        if (sign.equals("")){
            num1 += "7";
            displayNum.setText(num1);
        }else {
            num2 += "7";
            displayNum.setText(num2);
        }
    }
    public void getEight(View view) {
        TextView displayNum = findViewById(R.id.display);
        if (sign.equals("")){
            num1 += "8";
            displayNum.setText(num1);
        }else {
            num2 += "8";
            displayNum.setText(num2);
        }
    }
    public void getNine(View view){
        TextView displayNum = findViewById(R.id.display);
        if (sign.equals("")){
            num1 += "9";
            displayNum.setText(num1);
        }else {
            num2 += "9";
            displayNum.setText(num2);
        }
    }
    public void getDiv(View view){
        sign = "/";
    }
    public void getPlus(View view){
        sign = "+";
    }
    public void getMinus(View view){
        sign = "-";
    }
    public void getHalf(View view){
        sign = "%";
    }
    public void getMulti(View view){
        sign = "*";
        Button multi = findViewById(R.id.multi);
        multi.isFocused();
    }
    public void getRes(View view){
        TextView getRes = findViewById(R.id.display);
        if (num2 == ""){
            getRes.setText(num1);
            return;
        }
        float number1 = Float.parseFloat(num1);
        float number2 = Float.parseFloat(num2);
        switch (sign){
            case "/":
                float result = number1 / number2;
                res = String.valueOf(result);
                getRes.setText(res);
                break;
            case "+":
                result = number1 + number2;
                res = String.valueOf(result);
                getRes.setText(res);
                break;
            case "-":
                result = number1 - number2;
                res = String.valueOf(result);
                getRes.setText(res);
                break;
            case "*":
                result = number1 * number2;
                res = String.valueOf(result);
                getRes.setText(res);
                break;
            case "%":
                result = number1 % number2;
                res = String.valueOf(result);
                getRes.setText(res);
                break;
        }
        num1 = num2 = res = "";
    }

    public void getDot(View view){
        TextView displayNum = findViewById(R.id.display);
        if (sign.equals("")){
            num1 += ".";
            displayNum.setText(num1);
        }else {
            num2 += ".";
            displayNum.setText(num2);
        }
    }
    public void isMinus(View view){
        TextView displayNum = findViewById(R.id.display);
        if (sign.equals("")){
            //num1 += ".";
            float numTemp = Float.parseFloat(num1);
            numTemp *= -1;
            num1 = String.valueOf(numTemp);
            displayNum.setText(num1);
        }else {
            float numTemp = Float.parseFloat(num2);
            numTemp *= -1;
            num2 = String.valueOf(numTemp);
            displayNum.setText(num2);
        }
    }
}