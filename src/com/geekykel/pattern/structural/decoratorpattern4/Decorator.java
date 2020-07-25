package com.geekykel.pattern.structural.decoratorpattern4;

abstract class Decorator extends Bread {
    abstract String getDescription();
    abstract int getKcal();
}