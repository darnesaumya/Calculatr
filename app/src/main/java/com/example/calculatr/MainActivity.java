package com.example.calculatr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button one,two,three,four,five,six,seven,eight,nine,zero,add,sub,mult,div,equal;
    EditText tf1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = (Button)findViewById(R.id.button);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tf1.append("1");
            }
        });
        two = findViewById(R.id.button2);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tf1.append("2");
            }
        });
        three = findViewById(R.id.button3);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tf1.append("3");
            }
        });
        four = findViewById(R.id.button4);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tf1.append("4");
            }
        });
        five = findViewById(R.id.button5);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tf1.append("5");
            }
        });
        six = findViewById(R.id.button6);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tf1.append("6");
            }
        });
        seven = findViewById(R.id.button7);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tf1.append("7");
            }
        });
        eight = findViewById(R.id.button8);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tf1.append("8");
            }
        });
        nine = findViewById(R.id.button9);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tf1.append("9");
            }
        });
        zero = findViewById(R.id.button15);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tf1.append("0");
            }
        });
        add = findViewById(R.id.button10);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tf1.append("+");
            }
        });
        div = findViewById(R.id.button11);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tf1.append("/");
            }
        });
        sub = findViewById(R.id.button12);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tf1.append("-");
            }
        });
        mult = findViewById(R.id.button13);
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tf1.append("X");
            }
        });
        equal = findViewById(R.id.button14);
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
        tf1 = findViewById(R.id.Text1);
    }
    MainActivity() {

    }
}
