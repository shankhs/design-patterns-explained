package org.shankhs.solution;

public class Preferences {
    // This instance is how the world interacts with Preferences.
    private static Preferences instance = null;

    private Preferences() {
    }

    // Init the instance.
    public static Preferences getInstance() {
        // If the instance is null create a new Preferences object.
        // In real world, this creation will be in another method.
        if (instance == null) {
            instance = new Preferences();
        }
        return instance;
    }

    /**
     * @return the string describing this object.
     */
    public String stringify(String host, String port) {
        return "Preferences{" +
               "Host='" + host + '\'' +
               ", Port='" + port + '\'' +
               '}';
    }
}
