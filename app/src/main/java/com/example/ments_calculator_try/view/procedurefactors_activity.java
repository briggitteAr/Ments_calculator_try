package com.example.ments_calculator_try.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.ments_calculator_try.R;

public class procedurefactors_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_procedurefactors);

        findViewById(R.id.next_button).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent nextIntent = new Intent(getApplicationContext(),diseasefactors_activity.class);
                startActivity(nextIntent);
            }
        });

        findViewById(R.id.return_button).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent returnIntent = new Intent(getApplicationContext(),patientInformation_activuty.class);
                startActivity(returnIntent);
            }
        });

        Spinner orspiner=findViewById(R.id.ortime_spinner);
        String[] oroptions={"<30 min","31-60 min","61-120 min","121-180 min", ">181 min"};
        ArrayAdapter<String> arrayadapterortime=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,oroptions);
        orspiner.setAdapter(arrayadapterortime);

        orspiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });


        Spinner losspiner=findViewById(R.id.estimatedlos_spinner);
        String[] losoptions={"Outpatient","<23 hours","24-48 hours","2-3 days", ">4 days"};
        ArrayAdapter<String> arrayadapterlosestimation=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,losoptions);
        losspiner.setAdapter(arrayadapterlosestimation);

        losspiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });



        Spinner icuspiner=findViewById(R.id.icu_spinner);
        String[] icuoptions={"Very Unlikely","<5%","5-10%","11-25%", ">25%"};
        ArrayAdapter<String> arrayadaptericu=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,icuoptions);
        icuspiner.setAdapter(arrayadaptericu);

        icuspiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });



        Spinner bloodspiner=findViewById(R.id.blood_spiner);
        String[] bloodoptions={"<100 cc","100-250 cc","250-500 cc","500-750 cc", ">751 cc"};
        ArrayAdapter<String> arrayadapterblood=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,bloodoptions);
        bloodspiner.setAdapter(arrayadapterblood);

        bloodspiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });





        Spinner teamspiner=findViewById(R.id.teamsize_spinner);
        String[] teamsizeoptions={"1","2","3","4", "5"};
        ArrayAdapter<String> arrayadapterteamsize=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,teamsizeoptions);
        teamspiner.setAdapter(arrayadapterteamsize);

        teamspiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });



        Spinner intubationspiner=findViewById(R.id.intubation_spinner);
        String[] intubationoptions={"<1%","1-5%","6-10%","11-25%", ">25%"};
        ArrayAdapter<String> arrayadapterintubation=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,intubationoptions);
        intubationspiner.setAdapter(arrayadapterintubation);

        intubationspiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });




        Spinner sitespiner=findViewById(R.id.surgicalsite_spinner);
        String[] surgicalsiteoptions={"None of the following variables","Abdominopelvic MIS","Abdominopelvic open surgery, infaumbilical","Abdominopelvic open surgery, supraumbilical", "OHNS/upper or GI/thoracic"};
        ArrayAdapter<String> arrayadaptersurgicalsite=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,surgicalsiteoptions);
        sitespiner.setAdapter(arrayadaptersurgicalsite);

        sitespiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

    }
}