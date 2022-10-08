package com.example.ments_calculator_try.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ments_calculator_try.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.start_button).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent testIntent = new Intent(getApplicationContext(),login_activity.class);
                startActivity(testIntent);
            }
        });

    }
}