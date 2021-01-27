package com.mouatamid.onlinedocdev.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.mouatamid.onlinedocdev.R;
import com.mouatamid.onlinedocdev.adapters.DoctorAdapter;
import com.mouatamid.onlinedocdev.models.Doctor;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnItemClick;
import butterknife.OnTextChanged;

public class SearchDoctorByNameActivity extends AppCompatActivity {
    private ArrayList<Doctor> doctorArrayList;
    @BindView(R.id.list_of_doctors_view)
    ListView listOfDoctors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_doctor_by_name);
        ButterKnife.bind(this);

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Said","El malki","Gynécologue","N 8 App 5 Rue Nouasser, Casablanca","1"));
        doctors.add(new Doctor("Mbarek","Metouali","Opticien","N 5, Derb Sultan, Casablanca","1"));
        doctors.add(new Doctor("Youssef","Salhi","Opticien","N 10, Residence Wafaq Oulfa, Casablanca","1"));
        doctors.add(new Doctor("Mbarek","Metouali","Opticien","N 5, Derb Sultan, Casablanca","1"));
        setDoctorArrayList(doctors);
    }
    @OnClick(R.id.menu_button)
    public void showMenu(){
        Toast.makeText(getApplicationContext(),"Menu showed", Toast.LENGTH_SHORT).show();
    }
    @OnTextChanged(R.id.search_doctors_view)
    public void show_doctors(CharSequence s){
        if (!s.toString().equals("")){
            ArrayList<Doctor> list = new ArrayList<>();
            for (Doctor doctor : getDoctorArrayList()){
                String name = doctor.getFirstName() + " " + doctor.getLastName();
                if (name.toLowerCase().contains(s)){
                    list.add(doctor);
                }
            }
            DoctorAdapter doctorAdapter = new DoctorAdapter(getApplicationContext(), R.layout.doctor_info,list);
            listOfDoctors.setAdapter(doctorAdapter);

        }
        else {
            listOfDoctors.setAdapter(null);
        }
    }
   /* @OnItemClick(R.id.list_of_doctors_view)
    public void showProfile(){
        Intent intent = new Intent(getApplicationContext(), DoctorProfileActivity.class);
        startActivity(intent);
    }*/

    public ArrayList<Doctor> getDoctorArrayList() {
        return doctorArrayList;
    }

    public void setDoctorArrayList(ArrayList<Doctor> doctorArrayList) {
        this.doctorArrayList = doctorArrayList;
    }
}