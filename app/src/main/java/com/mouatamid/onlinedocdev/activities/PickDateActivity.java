package com.mouatamid.onlinedocdev.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.Toast;

import com.mouatamid.onlinedocdev.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PickDateActivity extends AppCompatActivity {
    @BindView(R.id.date_picker)
    DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_date);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.choose_date_button)
    public void selectDate(){
        String date = datePicker.getDayOfMonth() + "/" + (datePicker.getMonth() + 1) + "/" + datePicker.getYear();
        Toast.makeText(getApplicationContext(), date, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(), SearchResultsActivity.class);
        startActivity(intent);
    }
}