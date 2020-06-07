package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import javax.inject.Inject;
import javax.inject.Named;


public class MainActivity extends AppCompatActivity {
    @Inject
    @RedCloth
    Cloth mCloth;
    @Inject
    Shoe mShoe;
    @Inject
    Shoe mShoe2;
    @Inject
    Jacket mJacket;

    @Inject
    Utils mUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainComponent
                .builder()
                .baseComponent(((MyApplication)getApplication()).getBaseComponent())
                .build()
                .inject(this);

        Log.d("hyb","cloth " + mCloth);
        Log.d("hyb","shoe " + mShoe);
        Log.d("hyb","jacket " + mJacket);

        Log.d("hyb","cloth equal? " + (mCloth == mJacket.getCloth()));
        Log.d("hyb", "2 shoes are equal? " + (mShoe == mShoe2));

        Log.d("hyb"," utls? " + mUtils);

        Button button = findViewById(R.id.button);
        button.setOnClickListener((view) -> {
            Intent intent = new Intent(this, Main2Activity.class);
            startActivity(intent);
        });
    }
}
