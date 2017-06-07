package com.alpha.daggerdemo.dagger;

import com.alpha.daggerdemo.MainActivity;

import dagger.Component;

/**
 * Created by Alpha on 2016/4/14.
 */
@Component(modules = MainActivityModuel.class)
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
