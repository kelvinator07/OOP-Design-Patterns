package com.geekykel.pattern.creational.abstractfactory;

public class BurgerKingStore extends BurgerStore {
    @Override
    protected Burger createBurger(String type) {
        Burger burger = null;
        BurgerIngredientFactory ingredientFactory = new BurgerKingIngredientFactory();

        switch (type) {
            case Burger.CHEESE:
                burger = new Cheeseburger(ingredientFactory);
                burger.setName("BurgerKing Style Cheeseburger");
                break;
            case Burger.VEGAN:
                burger = new VeganBurger(ingredientFactory);
                burger.setName("BurgerKing Style VeganBurger");
                break;
            default:
                burger = new Hamburger(ingredientFactory);
                burger.setName("BurgerKing Style Hamburger");
                break;
        }

        if (burger != null) {
            burger.setBox("BurgerKing Box");
        }

        return burger;
    }
}
