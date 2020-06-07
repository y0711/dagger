package com.example.myapplication;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Provides;

@dagger.Module
public class MainModule {
    @Provides
    @RedCloth
    @PerActivity
    Cloth getRedCloth() {
        return new Cloth("red");
    }

    @Provides
    @Named("blue")
    Cloth getBlueCloth() {
        return new Cloth("blue");
    }

    @Provides
    Jacket getJacket(@RedCloth Cloth cloth) {
        return new Jacket(cloth);
    }
}
