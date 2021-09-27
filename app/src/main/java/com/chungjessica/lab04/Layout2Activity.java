package com.chungjessica.lab04;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class Layout2Activity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint_layout);
    }

    public void nextPage(View view) {
        Intent intent = new Intent(getApplicationContext(), Layout3Activity.class);
        startActivity(intent);
    }
}
