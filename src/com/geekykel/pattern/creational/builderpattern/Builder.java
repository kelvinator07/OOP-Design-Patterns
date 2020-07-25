package com.geekykel.pattern.creational.builderpattern;

import java.util.List;

/**
 * Builder interface describe step of object creation.
 **/
public interface Builder {
    public void setType(String type);
    public void setLanguages(List<String> languages);
    public void setExperience(int experience);
}
