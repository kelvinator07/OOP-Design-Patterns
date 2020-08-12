package com.geekykel.pattern.structural.facadepattern;

public class ComputerFacade {
    private Processor processor;
    private Keyboard keyboard;
    private Monitor monitor;

    public ComputerFacade(Processor processor, Keyboard keyboard, Monitor monitor) {
        this.processor = processor;
        this.keyboard = keyboard;
        this.monitor = monitor;
    }

    public void turnOnComputer() {
        processor.on();
        monitor.on();
        keyboard.on();
    }

    public void turnOffComputer() {
        keyboard.off();
        monitor.off();
        processor.off();
    }
}