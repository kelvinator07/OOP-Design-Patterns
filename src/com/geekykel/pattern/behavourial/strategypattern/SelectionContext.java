package com.geekykel.pattern.behavourial.strategypattern;

public class SelectionContext {
    private PersonSelectionAlgorithm algorithm;

    public void setAlgorithm(PersonSelectionAlgorithm algorithm) {
        // write your code here
        this.algorithm = algorithm;
    }

    public Person[] selectPersons(Person[] persons) {
        // write your code here
        return this.algorithm.select(persons);
    }
}
