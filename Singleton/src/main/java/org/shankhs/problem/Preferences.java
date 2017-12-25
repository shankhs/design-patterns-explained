package org.shankhs.problem;

public class Preferences {
    /**
     * Keeps track of the Preferences object, default is a Preferences object with localhost and
     * port as 27017.
     */
    public static Preferences global_preferences = new Preferences("127.0.0.1", "27017");
    private String mPort;
    private String mHost;

    public Preferences(String host, String port) {
        mHost = host;
        mPort = port;
    }

    /**
     * @return the string describing this object.
     */
    public String stringify() {
        return "Preferences{" +
               "mHost='" + mHost + '\'' +
               ", mPort='" + mPort + '\'' +
               '}';
    }
}
