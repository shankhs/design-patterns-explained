package org.shankhs.solution;

/**
 * New game layout class which doesn't care about the platform.
 */
public class GameLayout implements Layout {
    private LegacyGameLayout legacyGameLayout;

    public GameLayout() {
        legacyGameLayout = new LegacyGameLayout();
        // Get the bits of the platform and calls the legacy layout.
        legacyGameLayout.setBit(getPlatform());
    }

    public void draw() {
        legacyGameLayout.draw();
    }

    private int getPlatform() {
        // Hardcoded
        return 32;
    }
}
