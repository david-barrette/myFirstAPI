package com.example.demo.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeUtil {


    public static String getCurrentTime(){
        return getCurrentTime("yyyy-MM-dd HH:mm:ss");
    }

    public static String getCurrentTime(String pattern){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(pattern));
    }
}
