package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
  private PieChart pieChart;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Button myButton = (Button) findViewById(R.id.button);
    Integer color = getResources().getColor(R.color.red);
    myButton.setBackgroundColor(color);
  }
}
