package com.example.svwa.entities.common;

public abstract class Location {

    protected final String locationName;

    public Location(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationName() {
        return this.locationName;
    }
}