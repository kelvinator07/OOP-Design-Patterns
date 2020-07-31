package com.geekykel.pattern.creational.abstractfactory;

public class DellXPSDetailsFactory implements LaptopDetailsFactory {
    @Override
    public Display createDisplay() {
        return new DellXPSDisplay();
    }

    @Override
    public GraphicCard createGraphicCard() {
        return new DellXPSGraphicCard();
    }

    @Override
    public Processor createProcessor() {
        return new DellXPSProcessor();
    }

    @Override
    public SSD createSSD() {
        return new DellXPSSSD();
    }
}
