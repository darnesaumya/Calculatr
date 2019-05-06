package com.example.calculatr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button one,two,three,four,five,six,seven,eight,nine,zero,add,sub,mult,div,equal,clear,dot,mod,b1,b2,exp;
    TextView tf1;
    String input;
    double ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MainActivity obj = new MainActivity();
        one = findViewById(R.id.button);
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
                tf1.append(" + ");
            }
        });
        div = findViewById(R.id.button11);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tf1.append(" / ");
            }
        });
        sub = findViewById(R.id.button12);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tf1.append(" - ");
            }
        });
        mult = findViewById(R.id.button13);
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tf1.append(" X ");
            }
        });
        equal = findViewById(R.id.button14);
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               input = tf1.getText().toString() + " ";
               ans = obj.calculate(input);
               tf1.setText(""+ans);
            }
        });
        clear = findViewById(R.id.button16);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tf1.setText("");
            }
        });
        dot = findViewById(R.id.button17);
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tf1.append(".");
            }
        });
        mod = findViewById(R.id.button18);
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tf1.append(" % ");
            }
        });
        b1 = findViewById(R.id.button19);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tf1.append(" ( ");
            }
        });
        b2 = findViewById(R.id.button20);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tf1.append(" ) ");
            }
        });
        exp = findViewById(R.id.button21);
        exp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tf1.append(" ^ ");
            }
        });
        tf1 = findViewById(R.id.textView);
    }
    public double calculate(String instr){
        String blist;
        int x,y;
        double ab;
        while(instr.contains("(")) {
            x = instr.indexOf("(");
            y = instr.indexOf(")");
            blist = instr.substring(x+2,y-1);
            ab = calculate(blist);
            instr = instr.replace(instr.substring(x-1,y+2),""+ab);
        }
        String str[] = instr.split("\\s");
        List<String> inp = new ArrayList<>();
        inp.addAll(Arrays.asList(str));
        x = inp.indexOf("^");
        while (x>-1){
            double a = Double.parseDouble(inp.get(x-1));
            double b = Double.parseDouble(inp.get(x+1));
            inp.remove(x+1);
            inp.remove(x);
            inp.remove(x-1);
            inp.add(x-1,""+(Math.pow(a,b)));
            x = inp.indexOf("^");
        }
        x = inp.indexOf("%");
        while (x>-1){
            double a = Double.parseDouble(inp.get(x-1));
            double b = Double.parseDouble(inp.get(x+1));
            inp.remove(x+1);
            inp.remove(x);
            inp.remove(x-1);
            inp.add(x-1,""+(a%b));
            x = inp.indexOf("%");
        }
        x = inp.indexOf("/");
        while (x>-1){
            double a = Double.parseDouble(inp.get(x-1));
            double b = Double.parseDouble(inp.get(x+1));
            inp.remove(x+1);
            inp.remove(x);
            inp.remove(x-1);
            inp.add(x-1,""+(a/b));
            x = inp.indexOf("/");
        }
        x = inp.indexOf("X");
        while (x>-1){
            double a = Double.parseDouble(inp.get(x-1));
            double b = Double.parseDouble(inp.get(x+1));
            inp.remove(x+1);
            inp.remove(x);
            inp.remove(x-1);
            inp.add(x-1,""+(a*b));
            x = inp.indexOf("X");
        }
        x = inp.indexOf("+");
        while (x>-1){
            double a = Double.parseDouble(inp.get(x-1));
            double b = Double.parseDouble(inp.get(x+1));
            inp.remove(x+1);
            inp.remove(x);
            inp.remove(x-1);
            inp.add(x-1,""+(a+b));
            x = inp.indexOf("+");
        }
        x = inp.indexOf("-");
        while (x>-1){
            double a = Double.parseDouble(inp.get(x-1));
            double b = Double.parseDouble(inp.get(x+1));
            inp.remove(x+1);
            inp.remove(x);
            inp.remove(x-1);
            inp.add(x-1,""+(a-b));
            x = inp.indexOf("-");
        }
        if(inp.size() == 1)
            return Double.parseDouble(inp.get(0));
        else
            return 0.0;
    }
}