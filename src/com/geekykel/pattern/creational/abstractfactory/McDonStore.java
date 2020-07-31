package com.geekykel.pattern.creational.abstractfactory;

public class McDonStore extends BurgerStore {
    @Override
    protected Burger createBurger(String type) {
        Burger burger = null;
        BurgerIngredientFactory ingredientFactory = new McDonIngredientFactory();

        switch (type) {
            case Burger.CHEESE:
                burger = new Cheeseburger(ingredientFactory);
                burger.setName("McDonalds Style Cheeseburger");
                break;
            case Burger.VEGAN:
                burger = new VeganBurger(ingredientFactory);
                burger.setName("McDonalds Style VeganBurger");
                break;
            default:
                burger = new Hamburger(ingredientFactory);
                burger.setName("McDonalds Style Hamburger");
                break;
        }

        if (burger != null) {
            burger.setBox("McDonalds Box");
        }

        return burger;
    }
}
