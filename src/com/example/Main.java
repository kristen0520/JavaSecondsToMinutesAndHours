package com.example;

public class Main {

    public static void main(String[] args) {
        getDurationString(130, 50);
    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0 || seconds < 0 || seconds >=60){
            return "Invalid Value";
        }
        int h = minutes/60;
        int m = minutes - (h*60);
        System.out.println(h + "h " + m + "m " + seconds + "s");
        return h + "h " + m + "m " + seconds + "s";
    }

    public static String getDurationString(int seconds){
        if(seconds < 0){
            return "Invalid Value";
        }
        int s = seconds % 60;
        int m = seconds / 60;
        String durationString = getDurationString(m, s);
        return durationString;
    }

}
