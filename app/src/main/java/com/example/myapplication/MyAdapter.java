package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyAdapter extends ArrayAdapter<String> {

    Context context1;
    String[] countryName;
    int [] countryImage;

    public MyAdapter(Context context,String [] country_name,int [] country_image){
        super(context,R.layout.toast_layout,R.id.textView, country_name);

        this.context1 = context;
        this.countryName = country_name;
        this.countryImage = country_image;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //Öncıliklə layoutu çağırırıb onu bir View edib, bu adapterə inflate edirik
        LayoutInflater layoutInflater = (LayoutInflater) context1.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View viewLayout = layoutInflater.inflate(R.layout.toast_layout,parent,false);

        //və view - etdiyimiz layoutun içindəki view- ları tanımlayırıq ki içində nə var
        TextView textColumn = viewLayout.findViewById(R.id.textView);
        ImageView imageColumn =  viewLayout.findViewById(R.id.imageView);

        //daha sonra sistemdə ki, countryImage-ə position veririk bu getView - metodu nə qədər sətir varsa o qədər dövr edəcək və
        //bir bir hamısını çağıracaq məsələn position =0 olduqda 0-cı indexdə olan şəkil və yazı gələcək
        imageColumn.setImageResource(countryImage[position]);
        textColumn.setText(countryName[position]);

        return viewLayout;
    }
}
