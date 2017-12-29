package org.shankhs.solution;

public class RunDecorator extends Action {
    private Action action;

    public RunDecorator(Action action) {
        this.action = action;
    }

    public void doAction() {
        System.out.println("Running...");
        action.doAction();
    }
}
