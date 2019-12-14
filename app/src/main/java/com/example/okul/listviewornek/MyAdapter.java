package com.example.okul.listviewornek;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by okul on 9.9.2015.
 */
public class MyAdapter extends ArrayAdapter<Araba> {
    public MyAdapter(Context context, int resource, List<Araba> objects) {
        super(context, 0, objects);
        

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Araba a=getItem(position);
        if(convertView==null)
        {
            LayoutInflater li=LayoutInflater.from(getContext());
            convertView=li.inflate(R.layout.my_araba_uye,parent,false);

        }
        TextView lblAdi=(TextView) convertView.findViewById(R.id.lbl_adi);
        TextView lblAdet=(TextView) convertView.findViewById(R.id.lbl_sayi);
        lblAdi.setText(a.getAdi());
        lblAdet.setText(a.getAdet());


        return convertView;
    }
}
