package org.shankhs.solution;

public class App {
    public static void main(String[] args) {
        // Print the Preferences object with two different values and note that they are both the
        // same object.
        System.out.println(Preferences.getInstance()
                                   .stringify("127.0.0.1", "27017") + " by: " +
                           Preferences.getInstance());

        System.out.println(Preferences.getInstance()
                                   .stringify("www.shankhs.com", "27017") + " by: " +
                           Preferences.getInstance());
    }
}
