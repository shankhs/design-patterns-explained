package org.shankhs.solution;

public class App {
    public static void main(String[] args) {
        App app = new App();
        Layout layout = new GameLayout();
        app.draw(layout);

        // Prints:
        // Drawing map for 32
    }

    void draw(Layout layout) {
        layout.draw();
    }
}
