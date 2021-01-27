package com.mouatamid.onlinedocdev.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import com.mouatamid.onlinedocdev.R;
import com.mouatamid.onlinedocdev.models.Doctor;

import java.util.ArrayList;

public class DoctorAdapter extends ArrayAdapter<Doctor> {
    private ArrayList<Doctor> doctorArrayList;
    public DoctorAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Doctor> doctors) {
        super(context, resource, doctors);
        this.doctorArrayList = doctors;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.doctor_info,parent,false);

        TextView nameView = (TextView) convertView.findViewById(R.id.doctor_name);
        nameView.setText(doctorArrayList.get(position).getFirstName() + " " + doctorArrayList.get(position).getLastName());

        TextView specialityView = (TextView) convertView.findViewById(R.id.doctor_specialite);
        specialityView.setText(doctorArrayList.get(position).getSpeciality());

        TextView addressView = (TextView) convertView.findViewById(R.id.doctor_address);
        addressView.setText(doctorArrayList.get(position).getAddress());

        return convertView;
    }
}
