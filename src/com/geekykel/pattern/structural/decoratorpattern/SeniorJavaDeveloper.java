package com.geekykel.pattern.structural.decoratorpattern;

public class SeniorJavaDeveloper extends DeveloperDecorator {

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return "Make code review";
    }

    public String makeJob() {
        return super.makeJob() + " " + makeCodeReview();
    }
}
