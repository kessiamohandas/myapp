package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class calculator extends AppCompatActivity {
EditText ed1,ed2;
    String getmum1,getnum2,s3;
    Button b1;
    int number1,number2,number3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        ed1=(EditText)findViewById(R.id.num1);
        ed2=(EditText)findViewById(R.id.num2);
        b1=(Button)findViewById(R.id.add);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getmum1=ed1.getText().toString();
                getnum2=ed2.getText().toString();
                number1= Integer.parseInt(getmum1);
                number2=Integer.parseInt(getnum2);
                number3=number1+number2;
                s3=String.valueOf(number3);
            }
        });
    }
}
