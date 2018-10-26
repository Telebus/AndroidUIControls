package com.rp.androiduicontrols;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemname;

    public CustomListAdapter(Activity context, String[] itemname) {
        super(context, R.layout.mylist, itemname);

        this.context = context;
        this.itemname = itemname;

    }

    public View getView(int position, View view, ViewGroup parent){

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.mylist, null, true);

        TextView txtTitle = rowView.findViewById(R.id.item);
        TextView extratxt = rowView.findViewById(R.id.textView1);

        txtTitle.setText(itemname[position]);
        extratxt.setText("Descrição: " + itemname[position]);
        return rowView;

    }

}

