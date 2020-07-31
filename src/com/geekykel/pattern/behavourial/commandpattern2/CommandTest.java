package com.geekykel.pattern.behavourial.commandpattern2;

public class CommandTest {
    public static void main(String[] args) {
        Command moveCommand = new CommandMove(); // Testing system creates instance of CommandMove
        //moveCommand.entity = new TestMovable(); // and initializes entity field by testing entity

// then tested methods are invoked
        moveCommand.execute();
        moveCommand.undo();
    }
}
