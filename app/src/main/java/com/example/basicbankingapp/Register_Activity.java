package com.example.basicbankingapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Register_Activity extends Activity {

    Button b;
    TextView t;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        b.findViewById(R.id.reg);
        t.findViewById(R.id.logintxt);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1= new Intent(Register_Activity.this,Login_Activity.class);
                Toast.makeText(getApplicationContext(),"Registered Successfully..!!",Toast.LENGTH_SHORT).show();
            }
        });

        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(Register_Activity.this,Login_Activity.class);
                startActivity(i2);
            }
        });
    }
}
