package com.example.flavours;

/**
 * Designed and Developed by Mohammad suhail ahmed on 25/05/2021
 */
public enum AppFlavours {
    QA("qa"),
    DEV("dev"),
    STAGE("stage"),
    UAT("uat"),
    PROD("prod"),
    DEFAULT();
    String flavor;
    private AppFlavours(String flavor){
        this.flavor=flavor;
    }
    private AppFlavours(){}
    public String getName(){
        return flavor;
    }

}
