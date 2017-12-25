package org.shankhs.solution;

public class HyundaiBuilder implements CarsBuilder {
    private Hyundai hyundai = new Hyundai();

    @Override
    public void setOrigin(String origin) {
        hyundai.setOrigin(origin);
    }

    @Override
    public void setYear(String year) {
        hyundai.setYear(year);
    }

    @Override
    public Cars build() {
        return hyundai;
    }
}
