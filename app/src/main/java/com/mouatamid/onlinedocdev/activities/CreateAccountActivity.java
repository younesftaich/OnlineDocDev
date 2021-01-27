package com.mouatamid.onlinedocdev.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.mouatamid.onlinedocdev.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class CreateAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.button_create_account)
    public void signUp(){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}