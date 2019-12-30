package com.example.svwa.entities.common;

public class PriceHelper {

    public static int getQualityValue(Qualities quality, int baseValue){
        switch (quality) {
            case SILVER:
                return (int) Math.floor(baseValue + (baseValue * .25));
            case GOLD:
                return (int) Math.floor(baseValue + (baseValue * .5));
            case IRIDIUM:
                return baseValue * 2;
            default:
                return baseValue;
        }
    }

    public static int getWine(WikiObject object){
        if (object instanceof Crop) {
            if (((Crop) object).isWineable()) {
                // TODO: return crop wine prices
                return 0;
            } else {
                throw new IllegalArgumentException("DONT DO THAT");
            }
        } else if (object instanceof Foraged) {
            if (((Foraged) object).isWineable()) {
                // TODO: return foraged wine prices
                return 0;
            } else {
                throw new IllegalArgumentException("DONT DO THAT");
            }
        } else{
            throw new IllegalArgumentException("DONT DO THAT");
        }
    }
}
