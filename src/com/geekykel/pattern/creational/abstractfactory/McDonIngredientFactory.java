package com.geekykel.pattern.creational.abstractfactory;

public class McDonIngredientFactory implements BurgerIngredientFactory {
    @Override
    public Bun createBun() {
        return new McDonBun();
    }

    @Override
    public Cheese createCheese() {
        return new McDonCheese();
    }

    @Override
    public Cutlet createCutlet() {
        return new McDonCutlet();
    }

    @Override
    public Sauce createSauce() {
        return new McDonSauce();
    }
}
