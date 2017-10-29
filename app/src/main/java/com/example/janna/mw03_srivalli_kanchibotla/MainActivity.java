package com.example.janna.mw03_srivalli_kanchibotla;

        import android.content.Intent;
        import android.content.res.Resources;
        import android.graphics.Color;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ListView;
        import android.widget.TextView;

        import java.util.ArrayList;
        import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button pickup;
    Button dropoff;
    TextView titleText;
    static int mainFlag =0;
    static int[] flag = {0,0,0,0,0};
    int i=0;
    public static TableData[] pickUps = new TableData[5];
    public static TableData[] dropOffs = new TableData[6];
    public static void populateList(){
        pickUps[0] = new TableData("DRGW",18347,"Marble City");
        pickUps[1] = new TableData("KCS",29900,"Cargill");
        pickUps[2] = new TableData("SP",400089,"Lime Loader");
        pickUps[3] = new TableData("SP",401290,"Lime Loader");
        pickUps[4] = new TableData("GATX",73127,"Sallisaw");


        dropOffs[0] = new TableData("SLSF",78465,"Lime Loader");
        dropOffs[1] = new TableData("BN",441716,"Lime Loader");
        dropOffs[2] = new TableData("GATX",91381,"Feed Mill");
        dropOffs[3] = new TableData("KCS",753412,"Warehouse");
        dropOffs[4] = new TableData("CNW",499032,"Hampton Feed");
        dropOffs[5] = new TableData("GATX",73127,"Hampton Feed");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources res = getResources();
        populateList();

         pickup = (Button) findViewById(R.id.pickUp_button);
         dropoff = (Button) findViewById(R.id.dropOffs_button);
         titleText = (TextView) findViewById(R.id.textView);
        dropoff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent dropoffIntent = new Intent(getBaseContext(),DropOffsActivity.class);
                startActivity(dropoffIntent);
            }
        });

        pickup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mainFlag==1){

                }
                Intent pickupIntent = new Intent(getBaseContext(),PickUpsActivity.class);
                startActivity(pickupIntent);

            }
        });


    }

}
