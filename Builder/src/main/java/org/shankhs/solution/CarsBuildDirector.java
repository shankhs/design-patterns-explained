package org.shankhs.solution;

public class CarsBuildDirector {
    /**
     * Creates the specific {@link Cars} object as instructed by the {@link
     * CarsBuilder}.
     *
     * @param origin      country.
     * @param year        the company was found.
     * @param carsBuilder to define how {@link Cars} object should be built.
     * @return
     */
    public Cars buildCars(String origin, String year, CarsBuilder carsBuilder) {
        carsBuilder.setOrigin(origin);
        carsBuilder.setYear(year);
        return carsBuilder.build();
    }
}
