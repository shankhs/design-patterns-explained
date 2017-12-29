package org.shankhs.solution;

public class Player {

    public static void main(String[] args) {
        Action action = new Action();
        RunDecorator runDecorator = new RunDecorator(action);
        // Note the chaining of decorators.
        JumpDecorator jumpDecorator = new JumpDecorator(runDecorator);
        jumpDecorator.doAction();

        // Prints:
        // Jumping...
        // Running...
    }
}
