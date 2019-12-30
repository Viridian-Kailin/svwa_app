package com.example.svwa.entities.locations;

public abstract class Location {

    protected final String locationName;

    protected Location(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationName() {
        return this.locationName;
    }
}