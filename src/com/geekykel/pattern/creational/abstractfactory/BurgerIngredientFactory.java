package com.geekykel.pattern.creational.abstractfactory;

public interface BurgerIngredientFactory {
    Bun createBun();
    Cheese createCheese();
    Cutlet createCutlet();
    Sauce createSauce();
}
