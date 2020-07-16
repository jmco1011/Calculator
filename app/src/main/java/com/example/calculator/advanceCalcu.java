package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class advanceCalcu extends AppCompatActivity implements View.OnClickListener {
    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero, btnPoint, btnMean, btnMedian, btnMode ,  btnEquals, btnClear, btnDelete;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_calcu);
        initComponents();
    }

    public void initComponents() {
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnsSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnZero = findViewById(R.id.btnZero);
        btnPoint = findViewById(R.id.btnPoint);
        btnClear = findViewById(R.id.btnClear);
        btnDelete = findViewById(R.id.btnDelete);
        btnEquals = findViewById(R.id.btnEquals);
        editText = findViewById(R.id.editText);
        btnMean = findViewById(R.id.btnMean);
        btnMedian = findViewById(R.id.btnMedian);
        btnMode = findViewById(R.id.btnMode);

        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        btnZero.setOnClickListener(this);
        btnPoint.setOnClickListener(this);
        btnEquals.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnDelete.setOnClickListener(this);
        btnMean.setOnClickListener(this);
        btnMedian.setOnClickListener(this);
        btnMode.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnOne:
                editText.setText(editText.getText() + "1");
                break;
            case R.id.btnTwo:
                editText.setText(editText.getText() + "2");
                break;
            case R.id.btnThree:
                editText.setText(editText.getText() + "3");
                break;
            case R.id.btnFour:
                editText.setText(editText.getText() + "4");
                break;
            case R.id.btnFive:
                editText.setText(editText.getText() + "5");
                break;
            case R.id.btnsSix:
                editText.setText(editText.getText() + "6");
                break;
            case R.id.btnSeven:
                editText.setText(editText.getText() + "7");
                break;
            case R.id.btnEight:
                editText.setText(editText.getText() + "8");
                break;
            case R.id.btnNine:
                editText.setText(editText.getText() + "9");
                break;
            case R.id.btnZero:
                editText.setText(editText.getText() + "0");
                break;
            case R.id.btnPoint:
                editText.setText(editText.getText() + ",");
                break;
            case R.id.btnMean:
               String getInput = editText.getText().toString();
               Integer inn = Integer.parseInt(getInput);
               int[] ii = new int[]{inn};

               editText.setText(ii + "");
               break;
        }
    }
}