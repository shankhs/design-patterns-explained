package org.shankhs.problem;

public class Player {
    public static void main(String[] args) {
        // Player can run.
        Run run = new Run();
        run.doAction();

        // Player can jump.
        Jump jump = new Jump();
        jump.doAction();

        // We want to not create this extra class when the player tries to run
        // and jump at the same time.
        RunJump runJump = new RunJump();
        runJump.doAction();

        // Prints:
        // Running...
        // Jumping...
        // Running...
        // Jumping...
    }
}
