package com.geekykel.pattern.creational.abstractfactory;

public class Hamburger extends Burger {
    BurgerIngredientFactory ingredientFactory;

    Hamburger(BurgerIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void collect() {
        System.out.println("Collecting " + name);
        bun = ingredientFactory.createBun();
        cutlet = ingredientFactory.createCutlet();
        sauce = ingredientFactory.createSauce();
    }
}
