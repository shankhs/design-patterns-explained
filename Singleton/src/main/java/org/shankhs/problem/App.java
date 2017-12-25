package org.shankhs.problem;

public class App {
    public static void main(String[] args) {
        // Prints the default value of global variables.
        // Note the hash code of the default object.
        System.out.println(Preferences.global_preferences.stringify() + " by: " +
                           Preferences.global_preferences);

        // Create a user defined Preferences object.
        Preferences anotherHostPort = new Preferences("www.shankhs.com", "22");

        // Modify the global_preferences object by assigning the above user defined object to
        // global_preferences.
        Preferences.global_preferences = anotherHostPort;
        // Now all the other classes which depends on global_preferences will see a different
        // unexpected value!

        // Note that the hashcode of the the global object has changed.
        System.out.println(Preferences.global_preferences.stringify() + " by: " +
                           Preferences.global_preferences);
    }
}
