package com.example.myapplication;

public class Jacket {
    private Cloth mCloth;

    Jacket(Cloth cloth) {
        mCloth = cloth;
    }

    Cloth getCloth() {return mCloth;}

    @Override
    public String toString() {
        return "This is a Jacket made from " + mCloth;
    }
}
