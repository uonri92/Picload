package com.example.lam17.picload;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    ImageView imageView = (ImageView) findViewById(R.id.imageView);
    imageView.setImageResource(R.drawable.cat);
}
