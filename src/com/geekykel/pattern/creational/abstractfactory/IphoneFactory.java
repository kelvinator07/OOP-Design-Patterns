package com.geekykel.pattern.creational.abstractfactory;

public class IphoneFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        PhoneDetailsFactory detailsFactory = new IphoneDetailsFactory();

        return new Iphone(detailsFactory);
    }
}
