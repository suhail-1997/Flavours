package com.example.flavours;

import android.app.Application;
import android.util.Log;

/**
 * Designed and Developed by Mohammad suhail ahmed on 25/05/2021
 */
public class AppApplication extends Application {
    public static String REST_BASE_URL = "";

    @Override
    public void onCreate(){
        super.onCreate();


        if (BuildConfig.FLAVOR.equalsIgnoreCase(AppFlavours.QA.getName())) {
            REST_BASE_URL = "http://" + ENVIRONMENT.QA.getHost() + ":" + ENVIRONMENT.QA.getPortNumber() + "/app/v2/";
            
        } else if (BuildConfig.FLAVOR.equalsIgnoreCase(AppFlavours.DEV.getName())) {
            REST_BASE_URL = "http://" + ENVIRONMENT.DEV.getHost() + ":" + ENVIRONMENT.DEV.getPortNumber() + "/app/v2/";

        } else if (BuildConfig.FLAVOR.equalsIgnoreCase(AppFlavours.STAGE.getName())) {
            REST_BASE_URL = "http://" + ENVIRONMENT.STAGE.getHost() + ":" + ENVIRONMENT.STAGE.getPortNumber() + "/app/v2/";
            
        } else if (BuildConfig.FLAVOR.equalsIgnoreCase(AppFlavours.UAT.getName())) {
            REST_BASE_URL = "http://" + ENVIRONMENT.UAT.getHost() + ":" + ENVIRONMENT.UAT.getPortNumber() + "/app/v2/";
            
        } else if (BuildConfig.FLAVOR.equalsIgnoreCase(AppFlavours.PROD.getName())) {
            REST_BASE_URL = "https://" + ENVIRONMENT.PROD.getHost() + "/app/v2/";
            
        }

    }



}
