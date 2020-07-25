package com.geekykel.pattern.structural.decoratorpattern4;

class Ham extends Decorator {

    private Bread bread;

    Ham(Bread bread) {
        this.bread = bread;
    }

    @Override
    String getDescription() {
        return bread.getDescription() + ", Ham";
    }

    @Override
    int getKcal() {
        return bread.getKcal() + 2500;
    }
}
