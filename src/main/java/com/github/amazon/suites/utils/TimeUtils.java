package com.github.amazon.suites.utils;

public class TimeUtils {

    public static void makeWait(int timeInMillis) {
        try {
            Thread.sleep(timeInMillis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
