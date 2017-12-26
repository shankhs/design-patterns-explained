package org.shankhs.solution;

public class App {

    public static void main(String[] args) {
        MySqlConnection mySqlConnection = new MySqlConnection();
        mySqlConnection.setHost("localhost");

        DbConnector dbConnector = new DbConnector(mySqlConnection);

        Connection connection = dbConnector.createConnection();

        System.out.println("DbConnector instance " + connection.getClass());
        System.out.println("DbConnector host " + connection.getHost());

        mySqlConnection.setHost("127.0.0.1");

        connection = dbConnector.createConnection();
        System.out.println("DbConnector host " + connection.getHost());

        MongoConnection mongoConnection = new MongoConnection();
        mongoConnection.setHost("www.shankhs.com");

        dbConnector.setPrototypeConnection(mongoConnection);

        connection = dbConnector.createConnection();

        System.out.println("DbConnector instance " + connection.getClass());
        System.out.println("DbConnector host " + connection.getHost());

        // Prints:
        // DbConnector instance class org.shankhs.solution.MySqlConnection
        // DbConnector host localhost
        // DbConnector host 127.0.0.1
        // DbConnector instance class org.shankhs.solution.MongoConnection
        // DbConnector host www.shankhs.com
    }
}
