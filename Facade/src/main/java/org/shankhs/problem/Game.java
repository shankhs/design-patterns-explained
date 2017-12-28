package org.shankhs.problem;

public class Game {

    public static void main(String[] args) {
        GameMaps maps = new GameMaps("de_sunnyvale");
        maps.draw();
        // We need 10 players. Default is 5 so we need 5 more.
        int numExtraPlayer = 5;
        for (int i = 0; i < numExtraPlayer; i++) {
            new GamePlayer().draw();
        }
        Scores scores = new Scores();

        // now start the game.
        // Prints:
        // Drawing maps: de_sunnyvale
        // Drawing player.
        // Drawing player.
        // Drawing player.
        // Drawing player.
        // Drawing player.
        // Drawing player.
        // Drawing player.
        // Drawing player.
        // Drawing player.
        // Drawing player.
        // Initializing scores.
    }
}
