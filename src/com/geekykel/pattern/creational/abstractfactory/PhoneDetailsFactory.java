package com.geekykel.pattern.creational.abstractfactory;

public interface PhoneDetailsFactory {
    Camera createCamera();
    Display createDisplay();
    Processor createProcessor();
    Security createSecurity();
}
