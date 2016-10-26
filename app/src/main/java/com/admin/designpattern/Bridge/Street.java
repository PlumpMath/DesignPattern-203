package com.admin.designpattern.Bridge;

/**
 * Created by Administrator on 2016/10/26 0026.
 */
public class Street extends AbstractRoad {

    public Street(AbstractVehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void run() {
        mVehicle.run();
        System.out.println("在街道上行驶");
    }
}
