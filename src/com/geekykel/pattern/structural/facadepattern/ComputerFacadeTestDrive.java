package com.geekykel.pattern.structural.facadepattern;

public class ComputerFacadeTestDrive {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard();
        Monitor monitor = new Monitor();
        Processor processor = new Processor();

        ComputerFacade computerFacade = new ComputerFacade(processor, keyboard, monitor);

        computerFacade.turnOnComputer();
        computerFacade.turnOffComputer();
    }

//    Processor on
//    Monitor on
//    Keyboard on
//    Backlight is turned on
//    Keyboard off
//    Backlight is turned off
//    Monitor off
//    Processor off
}
