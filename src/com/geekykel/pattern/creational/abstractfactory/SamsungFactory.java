package com.geekykel.pattern.creational.abstractfactory;

public class SamsungFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        PhoneDetailsFactory detailsFactory = new SamsungDetailsFactory();

        return new Samsung(detailsFactory);
    }
}
