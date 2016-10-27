package com.admin.designpattern.Facade;

/**
 * Created by Administrator on 2016/10/27 0027.
 */
public class ConcretePhone implements PhoneImpl {
    @Override
    public void dail() {
        System.out.println("打电话");
    }

    @Override
    public void huangup() {
        System.out.println("挂电话");
    }
}
