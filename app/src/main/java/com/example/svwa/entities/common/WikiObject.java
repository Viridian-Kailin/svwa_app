package com.example.svwa.entities.common;

public abstract class WikiObject {

    protected final String objectIdentifier;

    public WikiObject(String objectIdentifier) {
        this.objectIdentifier = objectIdentifier;
    }

    public String getId() {
        return this.objectIdentifier;
    }
}
