package com.geekykel.pattern.creational.abstractfactory;

public interface LaptopDetailsFactory {
    Display createDisplay();
    GraphicCard createGraphicCard();
    Processor createProcessor();
    SSD createSSD();
}
