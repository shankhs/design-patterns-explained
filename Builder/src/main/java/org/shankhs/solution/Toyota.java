package org.shankhs.solution;

public class Toyota implements Cars {
    private String origin;
    private String year;

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public void name() {
        System.out.println("Toyota: " + origin + " : " + year);
    }
}
