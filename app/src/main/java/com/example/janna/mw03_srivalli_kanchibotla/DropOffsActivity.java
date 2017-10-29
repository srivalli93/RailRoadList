package com.example.janna.mw03_srivalli_kanchibotla;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class DropOffsActivity extends AppCompatActivity {
    ListView listView;
    int[] flag = {0,0,0,0,0,0};
    String[] roadName = {"SLSF","BN","GATX","KCS","CNW","GATX"};
   /* String[] location = {"Lime Loader","Lime Loader","Feed Mill","Warehouse","Hampton Feed","Hampton Feed"};
    long[] carNumber = {78465,441716,91381,753412,490032,73127};*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drop_offs);
        listView = (ListView)findViewById(R.id.dropOffTable);
        String[] from={"roadName","location"};
        int[] to={R.id.textView2,R.id.textView3};
        ArrayList<HashMap<String,String>> arrayList=new ArrayList<>();
       /* for (int i=0;i<5;i++)
        {
            HashMap<String,String> hashMap=new HashMap<>();//create a hashmap to store the data in key value pair
            hashMap.put("roadName",roadName[i]+" "+carNumber[i]);
            hashMap.put("location",location[i]);
            arrayList.add(hashMap);//add the hashmap into arrayList
        }*/
        CustomAdapter simpleAdapter=new CustomAdapter(this,MainActivity.pickUps);
        listView.setAdapter(simpleAdapter);
     ;
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), roadName[position], Toast.LENGTH_SHORT).show();
                if (flag[position]==0){
                    view.setBackgroundColor(Color.GREEN);
                    flag[position]=1;
                }
                else {
                    view.setBackgroundColor(Color.WHITE);
                    flag[position]=0;
                }
            }
        });
    }
}
