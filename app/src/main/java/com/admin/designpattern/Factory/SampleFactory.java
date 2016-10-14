package com.admin.designpattern.Factory;

/**
 * Created by Administrator on 2016/10/14 0014.
 */
public class SampleFactory {


    public static Sample creator(int which) {
        switch (which) {
            case 1:
                return new Sample1();
            case 2:
                return new Sample2();

            default:
                return null;
        }

    }

}
