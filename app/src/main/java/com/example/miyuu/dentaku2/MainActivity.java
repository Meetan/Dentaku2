package com.example.miyuu.dentaku2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    final int NONE = -1;
    final int PLUS = 0;
    final int SUB = 1;
    final int DIV = 2;
    final int MULTI = 3;

    TextView textViewA;
    TextView textViewB;
    TextView textViewK;

    int numberA = 0;
    int numberB = 0;
    int kigo = NONE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //レイアウト側からボタンのオンクリック作ったときは、findViewByidしなくておｋ、レイアウト側から設定するからとってこなくてもいい。

        textViewA = (TextView)findViewById(R.id.textViewA);
        textViewB = (TextView)findViewById(R.id.textViewB);
        textViewK = (TextView) findViewById(R.id.textViewK);

        textViewA.setText(String.valueOf(0));
        textViewB.setText(" ");
        textViewK.setText(" ");

    }

    public void numInput(int n ) {
        if (kigo == NONE) {
            numberA = numberA * 10 + n;
            textViewA.setText(String.valueOf(numberA));
        } else {
            numberB = numberB * 10 + n;
            textViewB.setText(String.valueOf(numberB));
        }


    }

    public void one (View v) {
        numInput(1);
    }

    public void two (View v) {
        numInput(2);
    }

    public void three (View v) {
        numInput(3);
    }

    public void four (View v) {
        numInput(4);
    }

    public void five (View v) {
        numInput(5);
    }

    public void six (View v) {
        numInput(6);
    }

    public void seven (View v) {
        numInput(7);
    }

    public void eight (View v) {
        numInput(8);
    }

    public void nine (View v) {
        numInput(9);
    }

    public void zero (View v) {
        numInput(0);
    }

    public void plus (View v) {
        kigo = PLUS;
        textViewK.setText("+");

    }

    public void sub(View v) {
        kigo = SUB;
        textViewK.setText("-");
    }

    public void multi(View v) {
        kigo = MULTI;
        textViewK.setText("×");
    }
    public void div(View v) {
        kigo = DIV;
        textViewK.setText("÷");
    }

    public void equal (View v){
        switch (kigo){
            case PLUS:
                numberA = numberA + numberB;
                break;
            case  SUB:
                numberA = numberA - numberB;
                break;
            case DIV:
                numberA = numberA / numberB;
                break;
            case MULTI:
                numberA = numberA * numberB;
                break;
            default:
                break;
        }

        numberB = 0;
        kigo = NONE;

        textViewA.setText(String.valueOf(numberA));
        textViewB.setText(" ");
        textViewK.setText(" ");

    }

    public void clear (View v){
        numberA = 0;
        numberB = 0;
        kigo = NONE;

        textViewA.setText(String.valueOf(0));
        textViewB.setText(" ");
        textViewK.setText(" ");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
