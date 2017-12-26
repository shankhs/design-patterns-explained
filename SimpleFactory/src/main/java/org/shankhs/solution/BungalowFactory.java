package org.shankhs.solution;

public class BungalowFactory extends HouseFactory {
    House create(String locationType) {
        return new Bungalow(locationType);
    }
}
