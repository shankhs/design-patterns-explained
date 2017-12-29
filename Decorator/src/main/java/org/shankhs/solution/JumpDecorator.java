package org.shankhs.solution;

public class JumpDecorator extends Action {
    private Action action;

    public JumpDecorator(Action action) {
        this.action = action;
    }

    public void doAction() {
        System.out.println("Jumping...");
        action.doAction();
    }
}
