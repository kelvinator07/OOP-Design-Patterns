package com.geekykel.pattern.creational.abstractfactory;

public class IphoneDetailsFactory implements PhoneDetailsFactory {
    @Override
    public Camera createCamera() {
        return new IphoneCamera();
    }

    @Override
    public Display createDisplay() {
        return new IphoneDisplay();
    }

    @Override
    public Processor createProcessor() {
        return new IphoneProcessor();
    }

    @Override
    public Security createSecurity() {
        return new IphoneSecurity();
    }
}
