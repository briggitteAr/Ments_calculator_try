package com.example.ments_calculator_try.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ments_calculator_try.R;

public class registration_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);


        findViewById(R.id.submit_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent testIntent = new Intent(getApplicationContext(),main_page.class);
                startActivity(testIntent);
            }
        });

        findViewById(R.id.singin2_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent thirdIntent=new Intent(getApplicationContext(),login_activity.class);
                startActivity(thirdIntent);
            }
        });

    }
}