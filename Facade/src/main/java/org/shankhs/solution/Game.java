package org.shankhs.solution;

public class Game {
    public static void main(String[] args) {
        // Use facade to create map and all the players.
        // Now we dont have to know the internals about how game is created,
        // the facade takes care of all of it.
        GameCreatorFacade facade = new GameCreatorFacade();
        facade.create("de_newsunnyvale", 5);

        // Prints:
        // Drawing maps: de_newsunnyvale
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
