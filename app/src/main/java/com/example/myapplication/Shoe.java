package com.example.myapplication;

import javax.inject.Inject;
import javax.inject.Singleton;

public class Shoe {
    @Inject
    Shoe() {}

    @Override
    public String toString() {
        return "this is a shoe";
    }

}
