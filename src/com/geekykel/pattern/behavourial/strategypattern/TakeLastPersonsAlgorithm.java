package com.geekykel.pattern.behavourial.strategypattern;

public class TakeLastPersonsAlgorithm implements PersonSelectionAlgorithm {

    private int count;

    public TakeLastPersonsAlgorithm(int count) {
        // write your code here
        this.count = count;
    }

    @Override
    public Person[] select(Person[] persons) {
        // write your code here
        Person[] p = new Person[this.count];
        for (int i = 0; i < this.count; i++) {
            p[count - 1 - i] = persons[persons.length - 1 - i];
        }

        for (int i = persons.length - count, counter = 0; i < persons.length; i++, counter++) {
            p[counter] = persons[i];
        }
        //Person[] p = Arrays.copyOfRange(persons, persons.length - count, persons.length);
        return p;
    }
}