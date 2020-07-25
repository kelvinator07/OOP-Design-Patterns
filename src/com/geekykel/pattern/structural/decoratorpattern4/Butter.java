package com.geekykel.pattern.structural.decoratorpattern4;

class Butter extends Decorator {
    private Bread bread;

    Butter(Bread bread) {
        this.bread = bread;
    }

    @Override
    String getDescription() {
        return bread.getDescription() + ", Butter";
    }

    @Override
    int getKcal() {
        return bread.getKcal() + 50;
    }
}