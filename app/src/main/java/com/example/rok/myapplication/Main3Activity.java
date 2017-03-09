package com.example.rok.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button b1,b2;
        EditText e1,e2;
        TextView t1,t2;
        b1 = (Button)findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.button2);
        e1 = (EditText)findViewById(R.id.editText1);
        e2 = (EditText)findViewById(R.id.editText2);
        t1 = (TextView)findViewById(R.id.textView1);
        t2 = (TextView)findViewById(R.id.textView2);
        String string = e1.getText().toString();
        double hwa  = Double.valueOf(string).doubleValue();
        final double result = calculte(hwa);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Hwa'c"+result,Toast.LENGTH_LONG).show();

            }
        });
        String string2 = e2.getText().toString();
        double sub = Double.valueOf(string2).doubleValue();
        final double result2 = calculate1(sub);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"sub"+result2,Toast.LENGTH_LONG).show();
            }
        });
    }
    public double calculte(double n){
        double result=(double) n*1.8+3.2;
        return result;
    }
    public double calculate1(double n){
        double result2 = (double)(n-32)/1.8;
        return result2;
    }


}
