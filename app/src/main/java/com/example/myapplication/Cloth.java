package com.example.myapplication;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

public class Cloth {

    private String mColor;

    Cloth(String color) {
        mColor = color;
    }

    @Override
    public String toString() {
        return mColor + " cloth";
    }
}
