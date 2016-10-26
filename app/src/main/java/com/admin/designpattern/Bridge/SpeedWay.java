package com.admin.designpattern.Bridge;

/**
 * Created by Administrator on 2016/10/26 0026.
 */
public class SpeedWay extends AbstractRoad {

    public SpeedWay(AbstractVehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void run() {
        mVehicle.run();
        System.out.println("在高速路上行驶");
    }
}
