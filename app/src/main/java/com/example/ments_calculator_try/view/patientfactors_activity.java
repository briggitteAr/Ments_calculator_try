package com.example.ments_calculator_try.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.ments_calculator_try.R;

public class patientfactors_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patientfactors);

        findViewById(R.id.nextbutton).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent nextIntent = new Intent(getApplicationContext(),results_activity.class);
                startActivity(nextIntent);
            }
        });

        findViewById(R.id.home_button).setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent homeintent= new Intent(getApplicationContext(),patientInformation_activuty.class);
                startActivity(homeintent);
            }
        });

        findViewById(R.id.return2button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnintent = new Intent(getApplicationContext(),procedurefactors_activity.class);
                startActivity(returnintent);
            }
        });

        Spinner agespinner=findViewById(R.id.age_spinner);
        String[] ageoptions={"<20 years", "21-40 years","41-50 years","51-65 years",">65 years"};
        ArrayAdapter<String> arrayadapterage= new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,ageoptions);
        agespinner.setAdapter(arrayadapterage);

        agespinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        Spinner lungspinner=findViewById(R.id.lungdisease_spinner);
        String[] lungoptions={"None", "-","-","Minimal(rare inhaler)",">Minimal"};
        ArrayAdapter<String> arrayadapterlung= new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,lungoptions);
        lungspinner.setAdapter(arrayadapterlung);

        lungspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        Spinner sleepspinner=findViewById(R.id.sleepapnea_spinner);
        String[] sleepoptions={"Not present", "-","-","Mild/moderate (no CPAP)","On CPAP"};
        ArrayAdapter<String> arrayadaptersleep= new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,sleepoptions);
        sleepspinner.setAdapter(arrayadaptersleep);

        sleepspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        Spinner cvspinner=findViewById(R.id.cvdisease_spinner);
        String[] cvoptions={"None", "Minimal(no meds)","Mild (1 med)","Moderate (2 meds)","Severe (>3 meds)"};
        ArrayAdapter<String> arrayadaptercv= new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,cvoptions);
        cvspinner.setAdapter(arrayadaptercv);

        cvspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        Spinner diabetesspinner=findViewById(R.id.diabetes_spinner);
        String[] diabetesoptions={"None", "-","Mild (no meds)","Moderate (PO meds only)",">Moderate (insulin)"};
        ArrayAdapter<String> arrayadapterdiabetes= new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,diabetesoptions);
        diabetesspinner.setAdapter(arrayadapterdiabetes);

        diabetesspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        Spinner inmunospinner=findViewById(R.id.inmunocompromised_spinner);
        String[] inmunooptions={"No", "-","-","Moderate","Severe"};
        ArrayAdapter<String> arrayadapterinmuno= new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,inmunooptions);
        inmunospinner.setAdapter(arrayadapterinmuno);

        inmunospinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        Spinner ilispinner=findViewById(R.id.ili_spinner);
        String[] ilioptions={"None (Asymptomatic)", "-","-","-","Yes"};
        ArrayAdapter<String> arrayadapterili= new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,ilioptions);
        ilispinner.setAdapter(arrayadapterili);

        ilispinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        Spinner covidspinner=findViewById(R.id.covid_spinner);
        String[] covidoptions={"No", "Probably not","Possibly","Probably","Yes"};
        ArrayAdapter<String> arrayadaptercovid= new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,covidoptions);
        covidspinner.setAdapter(arrayadaptercovid);

        covidspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}