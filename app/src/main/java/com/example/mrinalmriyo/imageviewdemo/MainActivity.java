package com.example.mrinalmriyo.imageviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iw=(ImageView)findViewById(R.id.imageView);
        iw.setImageResource(R.drawable.imagenew);

    }
}
