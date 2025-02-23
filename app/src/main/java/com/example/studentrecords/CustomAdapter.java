package com.example.studentrecords;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomAdapter extends ArrayAdapter {
    Context context;
    String[] studentNames;
    String[] studentAddresses;
    String[] studentPhones;

    // Constructor
    public CustomAdapter(MainActivity mainActivity, String[] names, String[] addresses, String[] phones) {
        super(mainActivity, 0, names);
        context = mainActivity;
        studentNames = names;
        studentAddresses = addresses;
        studentPhones = phones;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Layout set
        convertView = LayoutInflater.from(context).inflate(R.layout.item_view, parent, false);
        // TextView define
        TextView nameView = convertView.findViewById(R.id.text_name);
        TextView addressView = convertView.findViewById(R.id.text_address);
        TextView phoneView = convertView.findViewById(R.id.text_phone);
        // TextView set
        nameView.setText("Name: " + studentNames[position]);
        addressView.setText("Address: " + studentAddresses[position]);
        phoneView.setText("Phone: " + studentPhones[position]);

        return convertView;
    }
}