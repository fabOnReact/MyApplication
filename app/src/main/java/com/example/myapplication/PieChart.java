package com.example.myapplication;

import android.content.res.TypedArray;
import android.view.ViewGroup.LayoutParams;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.util.Log;

public class PieChart extends View {
  private static final String TAG = "PieChart";
  public PieChart(Context context, AttributeSet attrs) {
    super(context, attrs);
    TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.PieChart, 0, 0);
    Boolean showText = ta.getBoolean(R.styleable.PieChart_showText, false);  
    Log.w(TAG, "ta: " + showText);
  }
}
