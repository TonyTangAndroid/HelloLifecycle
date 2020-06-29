package com.demo.hellolifecycle;

import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

import timber.log.Timber;

public class ForegroundBackgroundListener implements DefaultLifecycleObserver {

  @Override
  public void onStart(@NonNull LifecycleOwner owner) {
    Timber.tag("TimberLogger").i("Entering into foreground:%s", owner.getClass().getSimpleName());
  }

  @Override
  public void onStop(@NonNull LifecycleOwner owner) {
    Timber.tag("TimberLogger").i("Entering into background:%s", owner.getClass().getSimpleName());
  }
}