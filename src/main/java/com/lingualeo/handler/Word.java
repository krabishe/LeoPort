package com.lingualeo.handler;

public class Word {
    private String name;
    private String context;

    public Word(String name) {
        this.name = name;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getName() {
        return name;
    }

    public String getContext() {
        return context;
    }
}
