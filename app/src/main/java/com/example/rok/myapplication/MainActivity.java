package com.example.rok.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1,b2,b3,b4,b5;
        EditText e1,e2;
        TextView t1,t2;
        e1 = (EditText)findViewById(R.id.editText);
        e2 = (EditText)findViewById(R.id.editText2);
        t1 = (TextView)findViewById(R.id.textView);
        t2 = (TextView)findViewById(R.id.textView2);
        b1 = (Button)findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.button2);
        b1 = (Button) findViewById(R.id.button1);
        String string = e1.getText().toString();
        int age = Integer.parseInt(string);
        final int result1  = calculate(age);
        String string2 = e2.getText().toString();
        int year = Integer.parseInt(string2);
        final int result2 = calcualte2(year);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"your year"+result2,Toast.LENGTH_LONG).show();
            }
        });




        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"your age"+result1,Toast.LENGTH_LONG).show();
            }
        });


    }
    public int calculate(int n){
        int result = 2017-n+1;
        return result;
    }
    public int calcualte2(int n){
        int result = 2017-n+1;
        return result;
    }



}
