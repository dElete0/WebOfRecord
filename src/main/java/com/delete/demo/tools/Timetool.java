package com.delete.demo.tools;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Timetool {
    public static String nowTime(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String now = dateFormat.format(new Date());
        return now;
    }
}
