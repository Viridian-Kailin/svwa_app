package com.example.svwa.entities.common;

public class Birthday {

    public final Seasons month;
    public final int day;

    public Birthday(Seasons month, int day) {
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(day);
        if (day == 1) {
            s.append("st");
        } else if (day == 2) {
            s.append("nd");
        } else if (day == 3) {
            s.append("rd");
        } else {
            s.append("th");
        }
        s.append(" of ").append(month.getDisplayName());
        return s.toString();
    }
}
