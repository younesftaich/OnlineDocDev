package com.mouatamid.onlinedocdev.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.mouatamid.onlinedocdev.R;
import com.mouatamid.onlinedocdev.adapters.CityAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnItemClick;
import butterknife.OnTextChanged;

public class PickCityActivity extends AppCompatActivity {
    private final String[] CITIES_ARRAY = {"Agadir","Asilah","Kenitra","Khouribga","Casablanca","Rabat","Marrakech"};
    private final List<String> cities = Arrays.asList(CITIES_ARRAY);
    private List<String> cities_to_show;
    @BindView(R.id.cities_list)
    ListView citiesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_city);
        ButterKnife.bind(this);
    }
    @OnTextChanged(R.id.search_view)
    public void show_cities(CharSequence sequence){
        if (!sequence.toString().equals("")){
            List<String> list = new ArrayList<>();
            for (String city : cities) {
                if (city.toLowerCase().contains(sequence)) {
                    list.add(city);
                }
            }
            cities_to_show = list;
            CityAdapter cityAdapter = new CityAdapter(getApplicationContext(),R.layout.city,cities_to_show);
            citiesList.setAdapter(cityAdapter);
        }
        else {
            citiesList.setAdapter(null);
        }
    }
    @OnItemClick(R.id.cities_list)
    public void onCityItemClicked(int position){
        Intent intent = new Intent(getApplicationContext(), PickDateActivity.class);
        startActivity(intent);
    }
}