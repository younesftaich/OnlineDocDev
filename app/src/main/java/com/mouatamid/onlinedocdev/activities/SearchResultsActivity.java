package com.mouatamid.onlinedocdev.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import com.mouatamid.onlinedocdev.R;
import com.mouatamid.onlinedocdev.adapters.DoctorAdapter;
import com.mouatamid.onlinedocdev.models.Doctor;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnItemClick;

public class SearchResultsActivity extends AppCompatActivity {
    @BindView(R.id.list_of_doctors_view)
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results);
        ButterKnife.bind(this);

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Said","El malki","Génécoloque","N 8 App 5 Rue Nouasser, Casablanca","1"));
        doctors.add(new Doctor("Mbarek","Metouali","Opticien","N 5, Derb Sultan, Casablanca","1"));
        doctors.add(new Doctor("Youssef","Salhi","Opticien","N 10, Residence Wafaq Oulfa, Casablanca","1"));
        doctors.add(new Doctor("Mbarek","Metouali","Opticien","N 5, Derb Sultan, Casablanca","1"));

        DoctorAdapter adapter = new DoctorAdapter(getApplicationContext(), R.layout.doctor_info, doctors);
        listView.setAdapter(adapter);
    }

    /*@OnItemClick(R.id.list_of_doctors_view)
    public void showProfile(){
        Intent intent = new Intent(getApplicationContext(), DoctorProfileActivity.class);
        startActivity(intent);
    }*/
}