package org.shankhs.problem;

public class Toyota implements Cars {
    private String origin;
    private String year;

    /**
     * @param origin country.
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * @param year the company was found.
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * Prints the complete name of the company of the car with its origin and
     * year.
     */
    public void name() {
        System.out.println("Toyota: " + origin + " : " + year);
    }
}
