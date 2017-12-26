package org.shankhs.problem;

public class App {
    public static void main(String[] args) {
        // Create houses of each type.
        // Note how we have to do new for each subclass.
        House house = new Hut();
        house.printNumBedrooms();

        house = new Bungalow("posh");
        house.printNumBedrooms();

        house = new Mansion();
        house.printNumBedrooms();
    }
}
