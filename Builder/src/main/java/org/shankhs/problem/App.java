package org.shankhs.problem;

public class App {
    public static void main(String[] args) {
        // Totally made up values.
        String origin = "Japan";
        String year = "1947";

        // Create Hyundai and Toyota object.
        // Note that both have similar methods and to set the origin
        // and year we have to call the same methods multiple times.

        Hyundai hyundai = new Hyundai();
        hyundai.setOrigin(origin);
        hyundai.setYear(year);
        hyundai.name();

        Toyota toyota = new Toyota();
        toyota.setOrigin(origin);
        toyota.setYear(year);
        toyota.name();

        // Prints:
        // Hyundai: Japan : 1947
        // Toyota: Japan : 1947
    }
}
