package com.admin.designpattern.Singleton;

/**
 * Created by Administrator on 2016/10/14 0014.
 */
public class Singleton1 {
    
    public static Singleton1 instance = new Singleton1();

    private Singleton1() {
    }


    public static Singleton1 newInstance(){
        return instance;
    }
}
