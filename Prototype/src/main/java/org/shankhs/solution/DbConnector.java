package org.shankhs.solution;

public class DbConnector {
    private Connection prototypeConnection;

    /**
     * Creates a DbConnector using the prototypeConnection object provided.
     *
     * @param prototype
     */
    public DbConnector(Connection prototype) {
        this.prototypeConnection = prototype;
    }

    /**
     * @return copy of the connection provided.
     */
    Connection createConnection() {
        return prototypeConnection.clone();
    }

    public void setPrototypeConnection(Connection connection) {
        this.prototypeConnection = connection;
    }
}
