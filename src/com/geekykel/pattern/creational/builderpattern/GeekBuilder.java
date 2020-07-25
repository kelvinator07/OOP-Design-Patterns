package com.geekykel.pattern.creational.builderpattern;

import java.util.List;

public class GeekBuilder implements Builder {

    private String type;
    private List<String> languages;
    private int experience;

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }
    @Override
    public void setExperience(int experience) {
        this.experience = experience;
    }

    public GeekConcreteComponent getResult() {
        // write your code here ...
        return new GeekConcreteComponent(type, languages, experience);
    }
}
