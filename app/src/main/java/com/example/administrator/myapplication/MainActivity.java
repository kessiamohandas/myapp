package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText ed1,ed2;
    Button b,b1,b2;
    String getUsername,getPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.uname);
        ed2=(EditText)findViewById(R.id.password);
        b=(Button)findViewById(R.id.login);
        b1=(Button)findViewById(R.id.reg1) ;
        b2=(Button)findViewById(R.id.nextapp);
       b.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               getUsername=ed1.getText().toString();
                       getPassword=ed2.getText().toString();
                               Toast.makeText(getApplicationContext(),getUsername,Toast.LENGTH_LONG).show();
               Toast.makeText(getApplicationContext(),getPassword,Toast.LENGTH_LONG).show();
//               Toast.makeText(getApplicationContext(), "hello", Toast.LENGTH_LONG).show();

         }
       });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),calculator.class);
                startActivity(i);
            }
        });
    }
}
