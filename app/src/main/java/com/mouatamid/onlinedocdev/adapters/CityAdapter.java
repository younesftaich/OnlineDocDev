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

import java.util.List;

public class CityAdapter extends ArrayAdapter<String> {
    private List<String> cities;
    public CityAdapter(@NonNull Context context, int resource, List<String> cities) {
        super(context, resource, cities);
        this.cities = cities;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.city, parent, false);
        TextView textView = (TextView) convertView.findViewById(R.id.city_name);
        textView.setText(cities.get(position));
        return convertView;
    }
}
