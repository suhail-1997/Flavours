package com.example.flavours;

/**
 * Designed and Developed by Mohammad suhail ahmed on 25/05/2021
 */
public enum ENVIRONMENT {
    QA("qa.appflavours.com","8080"),
    DEV("dev.appflavours.com","11180"),
    STAGE("stage.appflavours.com","8080"),
    UAT("uat.appflavours.com","8080"),
    PROD("appflavours.com",""),
    DEFAULT();

    private String host;
    private String portNumber;

    private ENVIRONMENT(String host,String portNumber){
        this.host=host;
        this.portNumber=portNumber;
    }
    private ENVIRONMENT(){
    }

    public String getHost(){
        return host;
    }

    public String getPortNumber(){
        return portNumber;
    }
}
