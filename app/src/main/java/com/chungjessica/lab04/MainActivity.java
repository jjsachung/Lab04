package com.chungjessica.lab04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.each_corner);
    }

    public void changeLayout(View view) {
        setContentView(R.layout.layout1);
    }
}