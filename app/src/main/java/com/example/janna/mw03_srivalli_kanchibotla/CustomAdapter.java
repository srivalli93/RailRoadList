package com.example.janna.mw03_srivalli_kanchibotla;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static android.R.attr.resource;

/**
 * Created by janna on 01-12-2016.
 */

public class CustomAdapter extends ArrayAdapter<TableData>{

    private final Activity context;
    private final TableData[] tableData;
    public CustomAdapter(Context context, TableData[] tableData) {
        super(context, R.layout.table_layout,tableData);
        this.context = (Activity) context;
        this.tableData = tableData;
    }



    public View getView(int position, View convertView, ViewGroup parent){


        LayoutInflater inflater = context.getLayoutInflater();
        View cellView = inflater.inflate(R.layout.table_layout,null,true);

        TextView title = (TextView) cellView.findViewById(R.id.textView2);
        TextView subTitle = (TextView) cellView.findViewById(R.id.textView3);

        title.setText(tableData[position].roadName + "  " + tableData[position].carNumber);
        subTitle.setText(tableData[position].location);

        if(tableData[position].selctionFlag)
            cellView.setBackgroundColor(Color.GREEN);
        else
            cellView.setBackgroundColor(Color.WHITE);

        return cellView;
    }
}
