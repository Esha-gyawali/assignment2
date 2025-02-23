package com.example.studentrecords;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    String[] names = {"Isha", "Shekhar", "Nirjal","Anuska","Bibita"};
    String[] addresses = {"Kathmandu", "Pokhara", "Lalitpur","Shantinagargate","Aloknagar"};
    String[] phoneNumbers = {"9812345678", "9823456789", "9834567890","98122232456","476854354463"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.stulist);
        lv.setAdapter(new CustomAdapter(MainActivity.this, names, addresses, phoneNumbers));
    }
}