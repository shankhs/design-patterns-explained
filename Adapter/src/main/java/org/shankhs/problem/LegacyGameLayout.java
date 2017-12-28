package org.shankhs.problem;

/**
 * Old game layout class which takes in the number of bits the platform support
 * and draws the layout depending on the bits.
 */
public class LegacyGameLayout {
    private int numBits;

    public void setBit(int numBits) {
        this.numBits = numBits;
    }

    public void draw() {
        System.out.println("Drawing map for " + numBits + " bits.");
    }
}
