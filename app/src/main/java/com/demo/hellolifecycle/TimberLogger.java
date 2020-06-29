package com.demo.hellolifecycle;

import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

import timber.log.Timber;

public class TimberLogger implements DefaultLifecycleObserver {

  @Override
  public void onCreate(@NonNull LifecycleOwner owner) {
    Timber.i("onCreate:%s", owner.getClass().getSimpleName());
  }

  @Override
  public void onStart(@NonNull LifecycleOwner owner) {
    Timber.i("onStart:%s", owner.getClass().getSimpleName());

  }

  @Override
  public void onResume(@NonNull LifecycleOwner owner) {
    Timber.i("onResume:%s", owner.getClass().getSimpleName());
  }

  @Override
  public void onPause(@NonNull LifecycleOwner owner) {
    Timber.i("onPause:%s", owner.getClass().getSimpleName());

  }

  @Override
  public void onStop(@NonNull LifecycleOwner owner) {
    Timber.i("onStop:%s", owner.getClass().getSimpleName());

  }

  @Override
  public void onDestroy(@NonNull LifecycleOwner owner) {
    Timber.i("onDestroy:%s", owner.getClass().getSimpleName());
  }
}
