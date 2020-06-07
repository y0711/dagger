package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class Main2Activity extends AppCompatActivity {
    @Inject
    Utils mUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        DaggerMain2Component
                .builder()
                .baseComponent(((MyApplication)getApplication()).getBaseComponent())
                .build()
                .inject(this);

        Log.d("hyb","utils? " + mUtils);
    }
}
