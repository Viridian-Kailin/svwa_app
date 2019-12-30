package com.example.svwa.entities.common;

public class Festival {

    public final Seasons month;
    public final WeatherPatterns weather;
    public final int day;
    public final int time;
//    public final String

    public Festival(Seasons month, WeatherPatterns weather, int day, int time){
        this.month = month;
        this.weather = weather;
        this.day = day;
        this.time = time;
    }

}
