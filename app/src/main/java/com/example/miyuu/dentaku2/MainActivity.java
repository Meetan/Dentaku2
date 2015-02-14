package com.example.miyuu.dentaku2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    TextView textView;
    TextView textView2;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button0;
    Button buttonp;
    Button buttonm;
    Button buttonw;
    Button buttoni;

    int number;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //レイアウトがわらボタンのオンクリック作ったときは、findViewByidしなくておｋ、レイアウト側から設定するからとってこなくてもいい。

        textView = (TextView)findViewById(R.id.textView);
        textView = (TextView)findViewById(R.id.textView2);
    }

    public void one (View v) {
        textView.append("1");
    }

    public void two (View v) {
        textView.append("2");
    }

    public void three (View v) {
        textView.append("3");
    }

    public void four (View v) {
        textView.append("4");
    }

    public void five (View v) {
        textView.append("5");
    }

    public void six (View v) {
        textView.append("6");
    }

    public void seven (View v) {
        textView.append("7");
    }

    public void eight (View v) {
        textView.append("8");
    }

    public void nine (View v) {
        textView.append("9");
    }

    public void zero (View v) {
        textView.append("0");
    }

    public void p (View v) {
        textView.append("+");
    }

    public void m (View v) {
        textView.append("-");
    }

    public void k (View v) {
        textView.append("×");
    }
    public void w (View v) {
        textView.append("÷");
    }

    public void i (View v){
        textView.append("=");
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
