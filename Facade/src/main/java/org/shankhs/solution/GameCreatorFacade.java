package org.shankhs.solution;

public class GameCreatorFacade {
    /**
     * Creates the map and requested number of players.
     *
     * @param numExtraPlayers number of extra players wanted to play this map.
     */
    public void create(String mapName, int numExtraPlayers) {
        GameMaps maps = new GameMaps(mapName);
        maps.draw();
        for (int i = 0; i < numExtraPlayers; i++) {
            new GamePlayer().draw();
        }
        Scores scores = new Scores();
    }
}
