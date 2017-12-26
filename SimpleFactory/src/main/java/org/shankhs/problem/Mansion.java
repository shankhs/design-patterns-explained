package org.shankhs.problem;

public class Mansion extends House {
    private String locationType;

    public Mansion() {
    }

    public Mansion(String locationType) {
        this.locationType = locationType;
    }

    /**
     * If the locationType is posh then print double bedrooms.
     */
    void printNumBedrooms() {
        if (locationType != null &&
            locationType.equalsIgnoreCase("posh")) {
            System.out.println(32);
        } else {
            System.out.println(16);
        }
    }
}
