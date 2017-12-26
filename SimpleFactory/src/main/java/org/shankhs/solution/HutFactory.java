package org.shankhs.solution;

public class HutFactory extends HouseFactory {
    House create(String locationType) {
        return new Hut();
    }
}
