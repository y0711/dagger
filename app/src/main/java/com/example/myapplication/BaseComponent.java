package com.example.myapplication;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = BaseModule.class)
@Singleton
interface BaseComponent {
    Utils getUtils();
}
