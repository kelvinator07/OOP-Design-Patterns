package com.geekykel.pattern.creational.factorypattern;

public class ClockFactory {
    private boolean produceToyClock;

    public ClockFactory(boolean produceToyClock) {
        this.produceToyClock = produceToyClock;
    }

    /**
     * It produces a clock according to a specified type: SAND, DIGITAL or MECH.
     * If some other type is passed, the method produces ToyClock.
     */
    public Clock produce(String type) {
        // write your code here
        if (type.equals("SAND")) {
            return new SandClock();
        } else if (type.equals("DIGITAL")) {
            return new DigitalClock();
        } else if (type.equals("MECH")) {
            return new MechanicalClock();
        } else if (this.produceToyClock) {
            return new ToyClock();
        } else {
            return null;
        }
    }
}
