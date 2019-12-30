package com.example.svwa.entities;

import com.example.svwa.entities.common.Birthday;
import com.example.svwa.entities.common.Seasons;

import org.junit.Test;


public class VillagerTest {

    @Test
    public void constructVincent() {
        Villager vincent = new Villager("VILLAGER_VINCENT");
        vincent.setMarriageAllowed(false);
        vincent.setName("Vincent");
        vincent.setBirthday(new Birthday(Seasons.SPRING, 10));

        System.out.println(vincent.getBirthday());

    }

}