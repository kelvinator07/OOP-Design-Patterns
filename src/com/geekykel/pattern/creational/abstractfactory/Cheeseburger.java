package com.geekykel.pattern.creational.abstractfactory;

public class Cheeseburger extends Burger {
    BurgerIngredientFactory ingredientFactory;

    Cheeseburger(BurgerIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void collect() {
        System.out.println("Collecting " + name);
        bun = ingredientFactory.createBun();
        cheese = ingredientFactory.createCheese();
        cutlet = ingredientFactory.createCutlet();
        sauce = ingredientFactory.createSauce();
    }
}
