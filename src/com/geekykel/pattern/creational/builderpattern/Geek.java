package com.geekykel.pattern.creational.builderpattern;

import java.util.List;

public class Geek {

    private String type;
    private List<String> languages;
    private int experience;

    Geek(String type, List<String> languages, int experience) {
        this.type = type;
        this.languages = languages;
        this.experience = experience;
    }

    public static class GeekBuilder {

        private String type;
        private List<String> languages;
        private int experience;

        public GeekBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public GeekBuilder setLanguages(List<String> languages) {
            this.languages = languages;
            return this;
        }

        public GeekBuilder setExperience(int experience) {
            this.experience = experience;
            return this;
        }

        public Geek build() {
            /* write your code here */
            return new Geek(type, languages, experience);
        }
    }

    public String toString() {
        return "Type : " + type + "\n" +
                "Languages : " + languages + "\n" +
                "Experience : " + experience + " years";
    }
}
