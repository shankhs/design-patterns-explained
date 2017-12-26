package org.shankhs.solution;

abstract class Connection {
    /**
     * Create a clone of this connection object.
     */
    public abstract Connection clone();

    public abstract String getHost();

    public abstract void setHost(String host);
}
