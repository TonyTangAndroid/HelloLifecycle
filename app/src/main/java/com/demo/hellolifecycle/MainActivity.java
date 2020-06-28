package com.demo.hellolifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    getLifecycle().addObserver(new TimberLogger());
    System.out.println("TimberLogger System out OnCreate");
  }
}