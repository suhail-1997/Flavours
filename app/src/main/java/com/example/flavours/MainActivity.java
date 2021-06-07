package com.example.flavours;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView,flavourName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);
        flavourName = findViewById(R.id.flavour_name);

        textView.setText(AppApplication.REST_BASE_URL);

        if(BuildConfig.FLAVOR.equalsIgnoreCase(AppFlavours.DEV.getName())){
            flavourName.setText("this is dev flavour");
        }
        else if(BuildConfig.FLAVOR.equalsIgnoreCase(AppFlavours.QA.getName())){
            flavourName.setText("this is QA flavour");
        }
        else if(BuildConfig.FLAVOR.equalsIgnoreCase(AppFlavours.UAT.getName())){
            flavourName.setText("this is UAT flavour");
        }
        else if(BuildConfig.FLAVOR.equalsIgnoreCase(AppFlavours.STAGE.getName())){
            flavourName.setText("this is STAGE flavour");
        }
        else if(BuildConfig.FLAVOR.equalsIgnoreCase(AppFlavours.PROD.getName())){
            flavourName.setText("this is PROD flavour");
        }
    }

}