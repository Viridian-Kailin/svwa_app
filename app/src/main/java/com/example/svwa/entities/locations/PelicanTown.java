package com.example.svwa.entities.locations;

import java.util.ArrayList;

/*
    This class is what is known as a Singleton. This means that there is exactly one instance of this object in all of the code which
    is then obtained through the getInstance() method. This is the only way to create "static" classes which are not enumerators, and since
    all of the locations are going to be different, this is the way we should make them.
 */
public class PelicanTown extends Location {

    private static final PelicanTown instance = new PelicanTown();
    private ArrayList<Location> subLocations;

    private PelicanTown() {
        super("Pelican Town");
        buildLocationMap();
    }

    public static PelicanTown getInstance() {
        return instance;
    }

    public ArrayList<Location> getSubLocations() {
        if (subLocations == null) {
            subLocations = new ArrayList<>();
        }
        return subLocations;
    }

    //This method needs to be updated with all of the locations once they have been made
    private void buildLocationMap()  {
        getSubLocations().add(Blacksmith.getInstance());
    }
}


 