package com.example.pelino_enhancedbasiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAdd, btnSub, btnMult, btnDiv, btnMod;

        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMult = findViewById(R.id.btnMult);
        btnDiv = findViewById(R.id.btnDiv);
        btnMod = findViewById(R.id.btnMod);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMod.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        double txtOperand1 = 0.0;
        double txtOperand2 = 0.0;
        TextView txtAnswer;

        EditText op1 = findViewById(R.id.txtOperand1);
        EditText op2 = findViewById(R.id.txtOperand2);
        TextView ans = findViewById(R.id.txt_answer);

        txtOperand1 = Double.parseDouble(op1.getText().toString());
        txtOperand2 = Double.parseDouble(op2.getText().toString());

        switch (view.getId()) {
            case R.id.btnAdd:
                ans.setText(Double.toString(doAddition(txtOperand1, txtOperand2)));
                break;
            case R.id.btnSub:
                ans.setText(Double.toString(doSubtraction(txtOperand1, txtOperand2)));
                break;
            case R.id.btnMult:
                ans.setText(Double.toString(doMultiplication(txtOperand1, txtOperand2)));
                break;
            case R.id.btnDiv:
                ans.setText(Double.toString(doDivision(txtOperand1, txtOperand2)));
                break;
            case R.id.btnMod:
                ans.setText(Double.toString(doModulo(txtOperand1, txtOperand2)));
                break;

        }

    }


    public static double doAddition(double x, double y){
        double ans = 0.0;
        ans = x + y;
        return ans;
    }
    public static double doSubtraction(double x, double y){
        double ans = 0.0;
        ans = x - y;
        return ans;
    }
    public static double doMultiplication(double x, double y){
        double ans = 0.0;
        ans = x * y;
        return ans;
    }
    public static double doDivision(double x, double y){
        double ans = 0.0;
        ans = x / y;
        return ans;
    }
    public static double doModulo(double x, double y){
        double ans = 0.0;
        ans = x % y;
        return ans;
    }

    }
    




