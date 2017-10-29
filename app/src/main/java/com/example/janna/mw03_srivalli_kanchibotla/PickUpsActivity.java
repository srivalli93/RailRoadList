package com.example.janna.mw03_srivalli_kanchibotla;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PickUpsActivity extends AppCompatActivity{


    private int selectedIndex;
    String[] roadName = {"DRGW","KCS","SP","SP","GATX"};
   /* String[] location = {"Marble City","Cargill","Lime Loader","Lime Loader","Sallisaw"};
    long[] carNumber = {18347,29900,400089,401290,73127};*/
    ListView listView;
    List<Integer> selectedCells = new ArrayList<Integer>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_ups2);

        listView = (ListView)findViewById(R.id.pickUpTable);
        String[] from={"roadName","location"};
        int[] to={R.id.textView2,R.id.textView3};


/*
       ArrayList<HashMap<String,String>> arrayList=new ArrayList<>();
        for (int i=0;i<5;i++)
        {
            HashMap<String,String> hashMap=new HashMap<>();//create a hashmap to store the data in key value pair
            hashMap.put("roadName",roadName[i]+" "+carNumber[i]);
            hashMap.put("location",location[i]);
            arrayList.add(hashMap);//add the hashmap into arrayList
        }
*/
        CustomAdapter listAdapter=new CustomAdapter(this,MainActivity.pickUps);

        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MainActivity.mainFlag=1;
                if (MainActivity.flag[position]==0){
                    view.setBackgroundColor(Color.GREEN);

                    MainActivity.flag[position]=1;
                }
                else {
                    view.setBackgroundColor(Color.WHITE);

                    MainActivity.flag[position]=0;
                }
                Toast.makeText(getApplicationContext(), roadName[position], Toast.LENGTH_SHORT).show();


            }
        });

}

}
