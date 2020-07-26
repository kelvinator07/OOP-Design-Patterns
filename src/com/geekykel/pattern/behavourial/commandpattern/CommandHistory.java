package com.geekykel.pattern.behavourial.commandpattern;

import java.util.Stack;

public class CommandHistory {

    private Stack<CommandNew> history = new Stack<>();

    public void push(CommandNew c) {
        history.push(c);
    }

    public CommandNew pop() {
        return history.pop();
    }

    public boolean isEmpty() { return history.isEmpty(); }

}
