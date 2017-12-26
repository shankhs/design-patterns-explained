package org.shankhs.solution;

public class MongoConnection extends Connection {
    private String host;

    public Connection clone() {
        MongoConnection clonedMongoConnection = new MongoConnection();
        clonedMongoConnection.setHost(this.host);
        return clonedMongoConnection;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}
