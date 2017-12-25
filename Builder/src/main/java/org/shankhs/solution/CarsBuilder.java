package org.shankhs.solution;

public interface CarsBuilder {
    void setOrigin(String origin);

    void setYear(String year);

    Cars build();
}
