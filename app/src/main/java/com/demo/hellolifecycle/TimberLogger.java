package com.demo.hellolifecycle;

import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

import timber.log.Timber;

public class TimberLogger implements LifecycleObserver {

  @OnLifecycleEvent(Event.ON_RESUME)
  public void onResume() {
    Timber.i("onResume");
  }

  @OnLifecycleEvent(Event.ON_PAUSE)
  public void onPause() {
    Timber.i("onPause");
  }

  @OnLifecycleEvent(Event.ON_START)
  public void onStart() {
    Timber.i("onStart");
  }

  @OnLifecycleEvent(Event.ON_STOP)
  public void onStop() {
    Timber.i("onStop");
  }
}
