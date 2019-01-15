package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
    Button b1,b2;
    String getname,getadm,getmob,getmail,getusername,getpass,getcompass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed1=(EditText)findViewById(R.id.nam);
        ed2=(EditText)findViewById(R.id.adm);
        ed3=(EditText)findViewById(R.id.mob);
        ed4=(EditText)findViewById(R.id.mail);
        ed5=(EditText)findViewById(R.id.uname);
        ed6=(EditText)findViewById(R.id.pass);
        ed7=(EditText)findViewById(R.id.compass);
        b1=(Button)findViewById(R.id.reg);
        b2=(Button)findViewById(R.id.alreg);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getname = ed1.getText().toString();
                getadm = ed2.getText().toString();
                getmob = ed3.getText().toString();
                getmail = ed4.getText().toString();
                getusername = ed4.getText().toString();
                getpass = ed4.getText().toString();
                getcompass = ed4.getText().toString();
                if (getpass.equals(getcompass)) {
                    Toast.makeText(getApplicationContext(), getname, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getadm, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getmob, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getmail, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getusername, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getpass, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getcompass, Toast.LENGTH_LONG).show();

                } else {
                    Toast.makeText(getApplicationContext(), "password and confirm password does not match", Toast.LENGTH_LONG).show();
                }
            }
        });




        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);

            }
        });



    }
}
