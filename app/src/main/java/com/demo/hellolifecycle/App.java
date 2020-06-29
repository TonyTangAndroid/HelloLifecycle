package com.demo.hellolifecycle;

import android.app.Application;

import androidx.lifecycle.ProcessLifecycleOwner;

import timber.log.Timber;
import timber.log.Timber.DebugTree;

public class App extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    Timber.plant(new DebugTree());
    ProcessLifecycleOwner.get().getLifecycle().addObserver(new ForegroundBackgroundListener());

  }
}
