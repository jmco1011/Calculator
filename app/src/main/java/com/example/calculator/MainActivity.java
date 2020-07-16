package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button simCalc, advCalc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
    }

    public void initComponents(){
        simCalc = findViewById(R.id.simCalc);
        advCalc = findViewById(R.id.advCalc);

        simCalc.setOnClickListener(this);
        advCalc.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.simCalc:
                Intent simpleCalc = new Intent(this,simpleCalcu.class);
                startActivity(simpleCalc);
                break;
            case R.id.advCalc:
                Intent advCalc = new Intent(this, advanceCalcu.class);
                startActivity(advCalc);
                break;
        }
    }
}