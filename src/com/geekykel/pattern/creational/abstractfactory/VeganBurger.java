package com.geekykel.pattern.creational.abstractfactory;

public class VeganBurger extends Burger {
    BurgerIngredientFactory ingredientFactory;

    VeganBurger(BurgerIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void collect() {
        System.out.println("Collecting " + name);
        bun = ingredientFactory.createBun();
        sauce = ingredientFactory.createSauce();
    }
}
