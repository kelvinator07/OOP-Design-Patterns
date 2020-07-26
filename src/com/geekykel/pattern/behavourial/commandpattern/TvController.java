package com.geekykel.pattern.behavourial.commandpattern;

public class TvController {
    private Command command;

    void setCommand(Command command) {
        this.command = command;
    }
    void executeCommand() {
        /* write your code here */
        command.execute();
    }
}
