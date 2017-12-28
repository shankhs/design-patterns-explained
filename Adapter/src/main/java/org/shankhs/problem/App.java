package org.shankhs.problem;

public class App {
    public static void main(String[] args) {
        App app = new App();
        // The new draw takes in the new Layout interface but the logic to draw
        // is in the LegacyGameLayout. The problem is how to call the
        // LegacyGameLayout from the new API.
    }

    void draw(Layout layout) {
        layout.draw();
    }
}