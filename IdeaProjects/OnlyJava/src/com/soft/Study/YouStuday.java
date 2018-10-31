package com.soft.Study;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class YouStuday {
    private   Date birthday;
    private static final Date BOOM_START;
    private static final Date BOOM_END;


    static {
         Calendar gmtcal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
         gmtcal.set(1946,Calendar.JANUARY,1,0,0,0);
        BOOM_START =  gmtcal.getTime();
        gmtcal.set(1965,Calendar.JANUARY,1,0,0,0);
        BOOM_END =  gmtcal.getTime();
     }
     public  boolean isBabyBoomer(){
        return birthday.compareTo(BOOM_START) >= 0 && birthday.compareTo(BOOM_END) < 0;
     }
}

