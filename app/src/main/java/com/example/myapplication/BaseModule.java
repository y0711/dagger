package com.example.myapplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class BaseModule {
    @Provides
    @Singleton
    Utils getUtils() {
        return new Utils();
    }
}
