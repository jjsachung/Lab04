package com.chungjessica.lab04;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class Layout6Activity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scrollview_with_textview);
    }

    public void nextPage(View view) {
        Intent intent = new Intent(getApplicationContext(), Layout7Activity.class);
        startActivity(intent);
    }
}
