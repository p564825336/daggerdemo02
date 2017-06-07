package com.alpha.daggerdemo.dagger;

import com.alpha.daggerdemo.User;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Alpha on 2016/4/14.
 */
@Module
public class MainActivityModuel {

    @Provides
    User provideUser(){
        return  new User("zhangsan", 12,"18612345678");
    }
}
