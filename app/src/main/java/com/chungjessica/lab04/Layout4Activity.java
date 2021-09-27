package com.chungjessica.lab04;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class Layout4Activity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.horizontal_scrollview);
    }

    public void nextPage(View view) {
        Intent intent = new Intent(getApplicationContext(), Layout5Activity.class);
        startActivity(intent);
    }
}
