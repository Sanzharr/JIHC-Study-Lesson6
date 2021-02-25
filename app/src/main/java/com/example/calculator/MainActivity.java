package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button7 , button8 , button9 , buttonx , buttonc , buttonp , buttonpr , buttonb , button4 , button5 , button6 , buttonm , button1 , button2 , button3 , buttonk , button0 , buttonz , buttont ;
    TextView tvSan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button7 = findViewById(R.id.btn7);
        button8 = findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);
        buttonx = findViewById(R.id.btnx);
        buttonc = findViewById(R.id.btnc);
        buttonp = findViewById(R.id.btnp);
        buttonpr = findViewById(R.id.btnpr);
        buttonb = findViewById(R.id.btnb);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        button6 = findViewById(R.id.btn6);
        buttonm = findViewById(R.id.btnm);
        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        buttonk = findViewById(R.id.btnk);
        button0 = findViewById(R.id.btn0);
        buttonz = findViewById(R.id.btnz);
        buttont = findViewById(R.id.btnt);



        tvSan = findViewById(R.id.tv_san);

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvSan.setText("7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvSan.setText("8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvSan.setText("9");
            }
        });

        buttonx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvSan.setText("x");
            }
        });

        buttonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvSan.setText("c");
            }
        });

        buttonp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvSan.setText("p");
            }
        });

        buttonpr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvSan.setText("pr");
            }
        });

        buttonb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvSan.setText("b");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvSan.setText("4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvSan.setText("5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvSan.setText("6");
            }
        });

        buttonm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvSan.setText("m");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvSan.setText("1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvSan.setText("2");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvSan.setText("0");
            }
        });

        buttonz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvSan.setText("z");
            }
        });

        buttont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvSan.setText("t");
            }
        });



        {

            {

