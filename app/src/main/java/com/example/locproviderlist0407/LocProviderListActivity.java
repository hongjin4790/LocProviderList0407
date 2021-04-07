package com.example.locproviderlist0407;

import androidx.appcompat.app.AppCompatActivity;

import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class LocProviderListActivity extends AppCompatActivity {
    TextView mTextView;
    LocationManager locMgr;
    List<String> locProviders;
    Button button ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.txtOutput);
        button = findViewById(R.id.button);
        locMgr = (LocationManager)getSystemService(LOCATION_SERVICE);
        locProviders = locMgr.getAllProviders();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = "";
                for(String list : locProviders)
                {

                 s += "Loc. Provider: "+ list+ "\n" + "Status: " + locMgr.isProviderEnabled(list) + "\n\n";

                }
                mTextView.setText(s);
            }
        });




    }
}