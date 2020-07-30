package com.geekykel.pattern.behavourial.strategypattern;

public class Finder {

    private FindingStrategy strategy;

    public Finder(FindingStrategy strategy) {
        // write your code here
        this.strategy = strategy;
    }

    /**
     * It performs the search algorithm according to the given strategy
     */
    public int find(int[] numbers) {
        // write your code here
        int len = numbers.length;
        return this.strategy.getResult(numbers);
    }
}


