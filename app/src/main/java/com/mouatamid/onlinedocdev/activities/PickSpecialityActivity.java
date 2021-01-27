package com.mouatamid.onlinedocdev.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.mouatamid.onlinedocdev.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class PickSpecialityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_speciality);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.next_button)
    public void nextButton(){
        Intent intent = new Intent(getApplicationContext(), PickCityActivity.class);
        startActivity(intent);
    }
}