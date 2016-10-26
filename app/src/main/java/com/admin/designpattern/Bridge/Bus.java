package com.admin.designpattern.Bridge;

/**
 * Created by Administrator on 2016/10/26 0026.
 */
public class Bus extends AbstractVehicle {
    @Override
    public void run() {
        System.out.print("公交车");
    }
}
