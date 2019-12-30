package com.example.svwa.entities.locations;

public class Blacksmith extends Location {

    private static final Blacksmith instance = new Blacksmith();

    protected Blacksmith() {
        super("Blacksmith");
    }


    public static Blacksmith getInstance() {
        return instance;
    }
}
