package com.admin.designpattern.Singleton;

/**
 * Created by Administrator on 2016/10/14 0014.
 */
public class Singleton2 {

    private static Singleton2 instance = null;

    private static Object lock = new Object();


    private static class InstanceHolder {
       private final static Singleton2 instance = new Singleton2();
    }

    private Singleton2() {

    }

    public static Singleton2 newInstance1() {

        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }


    public static Singleton2 newInstance2() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }


    public static synchronized Singleton2 newInstance3(){

        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

    public static Singleton2 newInstance4(){
        return InstanceHolder.instance;
    }



}
