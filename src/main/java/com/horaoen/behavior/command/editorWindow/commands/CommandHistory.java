package com.horaoen.behavior.command.editorWindow.commands;

import java.util.Stack;

/**
 * @author horaoen
 */
public class CommandHistory {
    private Stack<Command> history = new Stack<>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() { return history.isEmpty(); }
}