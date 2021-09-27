package com.chungjessica.lab04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    int[] ids;
    int count = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ids = new int[]{R.layout.backgroundcolor, R.layout.constraint_layout, R.layout.each_corner,
            R.layout.horizontal_scrollview, R.layout.overlapping_views, R.layout.scrollview_with_textview,
            R.layout.two_views_center};
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
//        if(event.getAction()==MotionEvent.ACTION_DOWN){
//            count = (++count)%ids.length;
//            setContentView(ids[count]);
//        }
        Intent intent = new Intent(getApplicationContext(), Layout1Activity.class);
        startActivity(intent);
        return true;
    }

    public void changeLayout(View view) {
        setContentView(R.layout.layout1);
    }
}