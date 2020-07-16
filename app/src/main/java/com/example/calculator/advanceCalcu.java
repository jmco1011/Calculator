package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.ViewDebug;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Arrays;

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
                String value = editText.getText().toString();
                value.replace(",", "");
                String[] result = new String[0];
                boolean bb = true;
                if (value != "") {
                    result = value.split(",");
                }
                for (int i = 0; i < result.length; i++) {
                    String d = result[i];
                    if (d.equalsIgnoreCase(toString()) || d == "") {
                        Toast.makeText(this, "Not A Number", Toast.LENGTH_SHORT).show();
                        bb = false;
                    }
                    if (bb == true) {
                        int len = result.length;
                        int mean = 0;
                        int total = len;

                        //mean calculation
                        for (int counter = 0; counter < total; counter++) {
                            mean = (int) (mean + Float.parseFloat(result[counter]));
                        }
                        float ii = mean / total;
                        float finalres = Math.round(ii * 100000 / 100000);
                        editText.setText(finalres + "");

                    }
                }

                break;

            case R.id.btnMode:


                break;
            case R.id.btnMedian:
                String value1 = editText.getText().toString();
                value1.replace(",", "");
                String[] result1 = new String[0];
                boolean bb1 = true;
                if (value1 != "") {
                    result1 = value1.split(",");
                }
                for (int i = 0; i < result1.length; i++) {
                    String d1 = result1[i];
                    if (d1.equalsIgnoreCase(toString()) || d1 == "") {
                        Toast.makeText(this, "Not A Number", Toast.LENGTH_SHORT).show();
                        bb = false;
                    }
                    if (bb1 == true) {
                        int len1 = result1.length;
                        int median = 0;
                        int total1 = len1;

                        //median calculation
                        Arrays.sort(result1);
                        if (total1%2 == 0){
                            float sdd = Float.parseFloat(result1[(total1/2) -1]) + Float.parseFloat(result1[total1/2]);
                            median = Integer.parseInt(result1[(total1 - 1)/2]);
                        } else{

                            median = Integer.parseInt(result1[(total1-1)/2]);
                        }
                        editText.setText(median + "");
                    }
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