package com.geekykel.pattern.creational.abstractfactory;

public class Samsung extends Phone {
    Samsung(PhoneDetailsFactory detailsFactory) {
        camera = detailsFactory.createCamera();
        display = detailsFactory.createDisplay();
        processor = detailsFactory.createProcessor();
        security = detailsFactory.createSecurity();
    }

    @Override
    public String getDescription() {
        return "Samsung Galaxy S10\n" + super.toString();
    }
}
