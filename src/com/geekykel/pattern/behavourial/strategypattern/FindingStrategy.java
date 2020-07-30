package com.geekykel.pattern.behavourial.strategypattern;

public interface FindingStrategy {
    /**
     * Returns search result
     */
    int getResult(int[] numbers);
}
