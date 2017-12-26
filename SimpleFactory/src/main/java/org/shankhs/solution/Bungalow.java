package org.shankhs.solution;

public class Bungalow extends House {
    private String locationType;

    public Bungalow() {
    }

    public Bungalow(String locationType) {
        this.locationType = locationType;
    }

    /**
     * If the locationType is posh then print double bedrooms.
     */
    void printNumBedrooms() {
        if (locationType != null &&
            locationType.equalsIgnoreCase("posh")) {
            System.out.println(8);
        } else {
            System.out.println(4);
        }
    }
}
