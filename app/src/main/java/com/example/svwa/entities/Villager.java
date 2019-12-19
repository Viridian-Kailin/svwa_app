package com.example.svwa.entities;

import com.example.svwa.entities.common.Birthday;
import com.example.svwa.entities.common.WikiObject;

public class Villager extends WikiObject {

    private Birthday birthday;
    private boolean isMarriageAllowed;
    private String name;
    //TODO: Add image and icon support
    //TODO: add some way to track gifts, possibly 5 lists
    //TODO: address handling

    public Villager(String id) {
        super(id);
    }

    public Birthday getBirthday() {
        return birthday;
    }

    public void setBirthday(Birthday birthday) {
        this.birthday = birthday;
    }

    public boolean isMarriageAllowed() {
        return isMarriageAllowed;
    }

    public void setMarriageAllowed(boolean marriageIndicator) {
        this.isMarriageAllowed = marriageIndicator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
