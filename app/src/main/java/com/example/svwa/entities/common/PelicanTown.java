package com.example.svwa.entities.common;

import java.util.ArrayList;
import java.util.Arrays;

public class PelicanTown extends Location {
    // instance fields
    public PelicanTown() {
        super("Pelican Town");
    }
    // constructor methods
    static ArrayList<Location> subLocations = new ArrayList<>(Arrays.asList((Location)new Blacksmith()));
    // main method
    public static class Blacksmith extends Location {
        public Blacksmith() { super("Blacksmith"); }
    }
}


 