package com.example.svwa.entities.locations;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PelicanTownTest {

    @Test
    public void getSubLocationsTest() {
        //Note that this test may need an adjustment if we change what location is added to the list first.
        String subLocationName = Blacksmith.getInstance().getLocationName();
        assertEquals(subLocationName, PelicanTown.getInstance().getSubLocations().get(0).getLocationName());
    }

}