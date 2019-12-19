package com.example.svwa.entities.common;

public enum WeatherPatterns {
    SUN("Sun"),
    RAIN("Rain"),
    WIND_SPRING ("Wind (Spring)"),
    WIND_FALL("Wind (Fall)"),
    STORM("Storm"),
    SNOW("Snow"),
    FESTIVAL("Festival"),
    WEDDING("Wedding Day")
    ;



    private String displayName;
    //TODO: Add ICON or TV image or both (reference to internal files)

    WeatherPatterns(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
