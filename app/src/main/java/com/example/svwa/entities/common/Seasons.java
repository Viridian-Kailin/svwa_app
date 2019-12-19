package com.example.svwa.entities.common;

public enum Seasons {
    SPRING("Spring", 1),
    SUMMER("Summer", 2),
    FALL("Fall", 3),
    WINTER("Winter", 4)
    ;

    private String displayName;
    private int monthAsInt;

    Seasons(String displayName, int monthAsInt) {
        this.displayName = displayName;
        this.monthAsInt = monthAsInt;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public int getMonthAsInt() {
        return this.monthAsInt;
    }

}
