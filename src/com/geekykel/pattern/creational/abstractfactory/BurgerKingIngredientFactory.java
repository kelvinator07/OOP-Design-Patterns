package com.geekykel.pattern.creational.abstractfactory;

public class BurgerKingIngredientFactory implements BurgerIngredientFactory {
    @Override
    public Bun createBun() {
        return new BurgerKingBun();
    }

    @Override
    public Cheese createCheese() {
        return new BurgerKingCheese();
    }

    @Override
    public Cutlet createCutlet() {
        return new BurgerKingCutlet();
    }

    @Override
    public Sauce createSauce() {
        return new BurgerKingSauce();
    }
}
