package com.example.janna.mw03_srivalli_kanchibotla;

/**
 * Created by janna on 29-11-2016.
 */

public class TableData {

    public String roadName;
    public long carNumber;
    public String location;
    public boolean selctionFlag;

   public TableData(String roadName, long carNumber,String location){
        this.roadName=roadName;
        this.carNumber=carNumber;
        this.location=location;
       this.selctionFlag = false;

    }
}
