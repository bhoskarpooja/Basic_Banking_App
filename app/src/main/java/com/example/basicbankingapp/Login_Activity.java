package com.example.basicbankingapp;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.example.basicbankingapp.UI.HomeScreen;

public class Login_Activity extends Activity {

    Button b1,b2;
    ProgressDialog p;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);


        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                p = new ProgressDialog(Login_Activity.this);
                p.setTitle("Loading...");
                p.setMessage("please wait...");
            Intent i = new Intent(Login_Activity.this, HomeScreen.class);
            startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1= new Intent(Login_Activity.this,Register_Activity.class);
                startActivity(i1);
            }
        });
    }


}
