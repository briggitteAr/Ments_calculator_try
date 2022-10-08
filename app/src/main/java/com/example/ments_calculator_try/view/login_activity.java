package com.example.ments_calculator_try.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ments_calculator_try.R;

public class login_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewById(R.id.login_button).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent secondintent=new Intent(getApplicationContext(),main_page.class);
                startActivity(secondintent);
            }
            });


    }
}