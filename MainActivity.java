package com.example.add;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText e1;
EditText e2;
TextView tv;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        tv=findViewById(R.id.res);
    }

    public void add(View view)
    {
        int num1= Integer.parseInt(e1.getText().toString());
        int num2= Integer.parseInt(e2.getText().toString());
        int res=num1+num2;
        tv.setText(""+res);
    }

    public void minus(View view)
    {
        int num1= Integer.parseInt(e1.getText().toString());
        int num2= Integer.parseInt(e2.getText().toString());
        int res=num1-num2;
        tv.setText(""+res);
    }

    public void multiply(View view)
    {
        int num1= Integer.parseInt(e1.getText().toString());
        int num2= Integer.parseInt(e2.getText().toString());
        int res=num1*num2;
        tv.setText(""+res);
    }

    public void divide(View view)
    {
        int num1= Integer.parseInt(e1.getText().toString());
        int num2= Integer.parseInt(e2.getText().toString());
        int res=num1/num2;
        tv.setText(""+res);
    }
}
