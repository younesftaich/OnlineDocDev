package com.mouatamid.onlinedocdev.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.mouatamid.onlinedocdev.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.imageView7)
    public void searchByNameActivityLaunch(){
        Intent intent = new Intent(getApplicationContext(), SearchDoctorByNameActivity.class);
        startActivity(intent);
    }
    @OnClick(R.id.button2)
    public void getStarted(){
        Intent intent = new Intent(getApplicationContext(), PickSpecialityActivity.class);
        startActivity(intent);
    }
}