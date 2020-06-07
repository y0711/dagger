package com.example.myapplication;

import dagger.Component;

@Component(modules = Main2Module.class, dependencies = BaseComponent.class)
@PerActivity
interface Main2Component {
    void inject(Main2Activity main2Activity);
}
