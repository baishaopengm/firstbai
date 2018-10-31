package com.soft.Study;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class MyStudy {
    private  int  calc;
    private  String  name;
    private  Date BrisDate; //date类型

    public MyStudy() {
    }

    public boolean isBabyBommer(){
        Calendar  fmtcal =  Calendar.getInstance(TimeZone.getTimeZone("GMT")); //GMT 格林威治时间
        fmtcal.set(1946,Calendar.JANUARY,1,0,0,0);
        Date boomStart  =  fmtcal.getTime();
        fmtcal.set(1965,Calendar.JANUARY,1,0,0,0);
        Date bommEnd =  fmtcal.getTime();
        return  BrisDate.compareTo(boomStart) >= 0 &&  BrisDate.compareTo(bommEnd) < 0;

    }
     public static  void  main(String[] args){
         MyStudy myStudy = new MyStudy();
         myStudy.isBabyBommer();
     }
}
