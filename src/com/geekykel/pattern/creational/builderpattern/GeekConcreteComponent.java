package com.geekykel.pattern.creational.builderpattern;

import java.util.List;

/**
 * ConcreteComponent - Geek.
 **/
public class GeekConcreteComponent {
    private String type;
    private List<String> languages;
    private int experience;

    public GeekConcreteComponent(String type, List<String> languages, int experience) {
        this.type = type;
        this.languages = languages;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Type : " + type + "\n" +
                "Languages : " + languages + "\n" +
                "Experience : " + experience + " years";
    }

}
