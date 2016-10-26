package com.admin.designpattern.Bridge;

/**
 * Created by Administrator on 2016/10/26 0026.
 */
public class Car extends AbstractVehicle {
    @Override
    public void run() {
        System.out.print("小汽车");
    }
}
