package org.shankhs.solution;

public class App {
    public static void main(String[] args) {
        HouseFactory factory = new HutFactory();

        House house = factory.create(null);
        house.printNumBedrooms();

        factory = new BungalowFactory();

        house = factory.create("posh");
        house.printNumBedrooms();
    }
}
