package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] countryName;
    int[] countryImage = {R.drawable.country1,R.drawable.country2,R.drawable.c3,R.drawable.c4, R.drawable.c5,R.drawable.c6};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);
        Resources resources = getResources();
        countryName= resources.getStringArray(R.array.country_name);

        MyAdapter myAdapter = new MyAdapter(this,countryName,countryImage);
        listView.setAdapter(myAdapter);

    }
}