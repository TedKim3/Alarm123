package com.example.alarm1;

import java.util.ArrayList;

public class Alarm {
    private int hour;
    private int minute;
    private String memo;
    private ArrayList<String> medications;

    public Alarm(int hour, int minute, String memo, ArrayList<String> medications) {
        this.hour = hour;
        this.minute = minute;
        this.memo = memo;
        this.medications = medications;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public String getMemo() {
        return memo;
    }

    public ArrayList<String> getMedications() {
        return medications;
    }
}
