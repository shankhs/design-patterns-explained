package org.shankhs.solution;

public class ToyotaBuilder implements CarsBuilder {
    private Toyota toyota = new Toyota();

    @Override
    public void setOrigin(String origin) {
        toyota.setOrigin(origin);
    }

    @Override
    public void setYear(String year) {
        toyota.setYear(year);
    }

    @Override
    public Cars build() {
        return toyota;
    }
}
