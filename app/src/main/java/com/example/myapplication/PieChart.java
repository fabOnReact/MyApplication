package com.example.myapplication;

import android.content.res.TypedArray;
import android.view.ViewGroup.LayoutParams;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class PieChart extends View {
  public PieChart(Context context, AttributeSet attrs) {
    super(context, attrs);
    setLayoutParams(new LayoutParams(100,100));
    // TypedArray a = context.getTheme().obtainStyledAttributes(
    //   attrs,
    //   R.styleable.PieChart,
    //   0, 0);
    // try {
    //   mShowText = a.getBoolean(R.styleable.PieChart_showText, false);
    //   textPos = a.getInteger(R.styleable.PieChart_labelPosition, 0);
    // } finally {
    //   a.recycle();
    // }
  }
}
