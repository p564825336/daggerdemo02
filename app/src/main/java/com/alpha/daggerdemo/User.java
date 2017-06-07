package com.alpha.daggerdemo;

/**
 * Created by Alpha on 2016/4/14.
 */
public class User {
    private String name;
    private  int age;
    private String tel;

    public User(String name, int age, String tel) {
        this.name = name;
        this.age = age;
        this.tel = tel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
