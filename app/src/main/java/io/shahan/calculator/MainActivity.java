package io.shahan.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView showRsult;
    Character operator;
    int num;
    int tempNum;
    String input="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showRsult = (TextView) findViewById(R.id.editText);
    }

    public void button18Clicked(View view) {
        insert(3);
    }

    public void button17Clicked(View view) {
        insert(2);
    }

    public void button16Clicked(View view) {
        insert(1);
    }

    public void button15Clicked(View view) {
        insert(6);
    }

    public void button14Clicked(View view) {
        insert(5);
    }

    public void button13Clicked(View view) {
        insert(4);
    }

    public void button12Clicked(View view) {
        insert(9);
    }

    public void button11Clicked(View view) {
        insert(8);
    }

    public void button10Clicked(View view) {
        insert(7);
    }

    public void button7Clicked(View view) {
        insert(0);
    }

    public void button3Clicked(View view) {
        showRsult.setText("");
        num = 0;
        tempNum = 0;
        input="";

    }

    public void button4Clicked(View view) {
        operation();
        operator = '+';

    }

    public void button5Clicked(View view) {
        operation();
        operator = '-';
    }

    public void button9Clicked(View view) {
        calculate();
    }

    public void buttonClicked(View view) {
        operation();
        operator = '/';
    }

    public void button6Clicked(View view) {
        operation();
        operator = '*';
    }

    private void insert(int i) {
        input = input + Integer.toString(i);
        num = Integer.parseInt(input);
        showRsult.setText(input);
    }

    private void calculate() {
        if (operator == '+') {
            num = num + tempNum;
        } else if (operator == '-') {
            num = num - tempNum;
        } else if (operator == '*') {
            num = num * tempNum;
        } else if (operator == '/') {
            num = num / tempNum;
        }
        showRsult.setText("" + num);

    }

    private void operation() {
        input = "";
        tempNum = num;
    }
}