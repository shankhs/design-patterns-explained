package org.shankhs.solution;

public class App {
    public static void main(String[] args) {
        // Totally made up values.
        String origin = "Japan";
        String year = "1947";

        // Use the directors to set the infos for each car.
        // Note that same object is used to build different objects.
        // and we dont have to call setters for each field everytime we
        // create a new Cars object.
        CarsBuildDirector carsBuildDirector = new CarsBuildDirector();

        carsBuildDirector.buildCars(origin, year, new HyundaiBuilder())
                .name();
        carsBuildDirector.buildCars(origin, year, new ToyotaBuilder())
                .name();

        // Prints:
        // Hyundai: Japan : 1947
        // Toyota: Japan : 1947
    }
}
