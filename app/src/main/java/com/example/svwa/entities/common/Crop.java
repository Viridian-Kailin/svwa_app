package com.example.svwa.entities.common;

public class Crop extends WikiObject {
    private Seasons season;
    private String name;
    private int basePrice;
    private int yieldAmount = 1;
    private int yieldTime;
    private boolean hasGiantCrop = false;
    private boolean isWineable = false;
    private boolean isJuicable = false;
    private boolean isPickleable = false;
    private boolean isJamable = false;

    // refers to table object
    public Crop(String id, String name, int basePrice, int yieldTime){
        super(id);
        this.name = name;
        this.basePrice = basePrice;
        this.yieldTime = yieldTime;
    }

    // Find base worth before skill or processing
    public int getValue(Qualities quality){
        return PriceHelper.getQualityValue(quality, basePrice);
    }

    // Find worth with skill bonus
    public int getValue(Qualities quality, boolean hasTiller){
        int value = getValue(quality);

        if (hasTiller) {
            return (int) Math.floor(value + (value * .1));
        } else {
            return value;
        }
    }

    // Change normal yield amount

    public int getYieldAmount() {
        return yieldAmount;
    }

    public void setYieldAmount(int yieldAmount) {
        this.yieldAmount = yieldAmount;
    }

    // Can become a giant crop

    public boolean hasGiantCrop() {
        return hasGiantCrop;
    }

    public void setHasGiantCrop(boolean hasGiantCrop) {
        this.hasGiantCrop = hasGiantCrop;
    }
}
