package org.shankhs.solution;

public class GameMaps implements IEntity {
    private String name;
    private int numPlayer = 5; // minimum number of players.

    public GameMaps(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing maps: " + name);
        for (int i = 0; i < numPlayer; i++) {
            new GamePlayer().draw();
        }
    }
}
