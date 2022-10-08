package com.example.ments_calculator_try.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ments_calculator_try.R;

public class patientInformation_activuty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_information_activuty);

        findViewById(R.id.mainpage_button).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent mainIntent= new Intent(getApplicationContext(),main_page.class);
                startActivity(mainIntent);
            }
        });


        findViewById(R.id.procedurefactors_button).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent procedurefactorsIntent= new Intent(getApplicationContext(),procedurefactors_activity.class);
                startActivity(procedurefactorsIntent);
            }
        });


        findViewById(R.id.diseasefactors_button).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent diseaseIntent= new Intent(getApplicationContext(),diseasefactors_activity.class);
                startActivity(diseaseIntent);
            }
        });


        findViewById(R.id.patientfactors_button).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent patientIntent= new Intent(getApplicationContext(),patientfactors_activity.class);
                startActivity(patientIntent);
            }
        });
    }
}