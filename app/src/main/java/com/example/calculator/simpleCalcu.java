package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.FocusFinder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class simpleCalcu extends AppCompatActivity implements View.OnClickListener{
    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero, btnPoint, btnPlus, btnMinus, btnMultiply, btnDivide, btnEquals, btnClear, btnDelete;
    EditText editText;
    Float valOne, valTwo;
    boolean addition, subtraction, multiplicaation, division;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calcu);
        initComponents();

    }

    public void initComponents(){
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
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnClear = findViewById(R.id.btnClear);
        btnDelete = findViewById(R.id.btnDelete);
        btnEquals = findViewById(R.id.btnEquals);
        editText = findViewById(R.id.editText);

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
        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnEquals.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnDelete.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
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
                editText.setText(editText.getText() + ".");
                break;
            case R.id.btnPlus:
                if (editText == null){
                    editText.setText("");
                }else{
                    valOne = Float.parseFloat(editText.getText() + "");
                    addition = true;
                    editText.setText(null);
                }
                break;
            case R.id.btnMinus:
                valOne = Float.parseFloat(editText.getText() + "");
                subtraction = true;
                editText.setText(null);
                break;
            case R.id.btnMultiply:
                valOne = Float.parseFloat(editText.getText() + "");
                multiplicaation = true;
                editText.setText(null);
                break;
            case R.id.btnDivide:
                valOne = Float.parseFloat(editText.getText() + "");
                division = true;
                editText.setText(null);
                break;
            case R.id.btnEquals:
                valTwo = Float.parseFloat(editText.getText() + "");
                if (addition == true){
                    editText.setText(valOne + valTwo + "");
                    addition = false;
                }

                if (subtraction == true){
                    editText.setText(valOne - valTwo + "");
                    subtraction = false;
                }
                if (multiplicaation == true){
                    editText.setText(valOne *valTwo + "");
                    multiplicaation = false;
                }
                if (division == true){
                    editText.setText(valOne/valTwo + "");
                    division = false;
                }
                break;
            case R.id.btnClear:
                editText.setText(null);
                break;
            case R.id.btnDelete:
                Editable numinput = editText.getText();
                if (numinput.length()>0){
                    numinput.delete(numinput.length() - 1, numinput.length());
                    editText.setText(numinput);
                }
        }
    }
}