package com.example.myapplication;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules=MainModule.class, dependencies = BaseComponent.class)
@PerActivity
interface MainComponent {
    void inject(MainActivity mainActivity);
}
