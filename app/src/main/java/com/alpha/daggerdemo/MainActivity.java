package com.alpha.daggerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alpha.daggerdemo.dagger.DaggerMainActivityComponent;
import com.alpha.daggerdemo.dagger.MainActivityComponent;
import com.alpha.daggerdemo.dagger.MainActivityModuel;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainActivityComponent component = DaggerMainActivityComponent.builder().mainActivityModuel(new MainActivityModuel()).build();
        component.inject(this);
    }
}
