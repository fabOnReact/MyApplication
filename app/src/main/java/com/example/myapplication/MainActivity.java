package com.example.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ViewGroup linearLayout = findViewById(R.id.linear_layout);
    linearLayout.setBackgroundColor(Color.RED);
    getWindow().getDecorView().post(new Runnable() {
        @Override
        public void run() {
          // TODO your magic code to be run
          ViewGroup linearLayout = findViewById(R.id.linear_layout);
          int height = linearLayout.getHeight()     ;
          int width = linearLayout.getWidth();
          Log.w("TESTING::", "height: " + height);
          Rect scrollBounds = new Rect();
          linearLayout.getHitRect(scrollBounds);
          Log.w("TESTING::", "scrollBound: " + scrollBounds);
          final int childCount = linearLayout.getChildCount();
          for (int i = 0; i < childCount; i++) {
            final View child = linearLayout.getChildAt(i);
            boolean isVisible = child.getLocalVisibleRect(scrollBounds);
            Log.w("TESTING::", "child i: " + i + " isVisible: " + isVisible);
          }
        }
    });
  }
}
