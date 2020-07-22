package com.geekykel;

public class TakePersonsWithStepAlgorithm implements PersonSelectionAlgorithm {

    private int step;

    public TakePersonsWithStepAlgorithm(int step) {
        // write your code here
        this.step = step;
    }

    @Override
    public Person[] select(Person[] persons) {
        // write your code here
        if  (this.step == 1) {
            return persons;
        }
        Person[] p = new Person[(int) Math.ceil((double) persons.length / (double) step)];
        for (int i = 0, count = 0; i < persons.length; i+=this.step, count++) {
            p[count] = persons[i];
        }
        return p;
    }
}