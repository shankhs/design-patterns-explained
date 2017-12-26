package org.shankhs.solution;

public class MySqlConnection extends Connection {
    private String host;

    public Connection clone() {
        MySqlConnection clonedMySqlConnection = new MySqlConnection();
        clonedMySqlConnection.setHost(host);
        return clonedMySqlConnection;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}
