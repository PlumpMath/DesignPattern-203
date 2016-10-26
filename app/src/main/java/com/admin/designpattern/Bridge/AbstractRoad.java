package com.admin.designpattern.Bridge;

/**
 * @link http://blog.csdn.net/jason0539/article/details/22568865
 *
 * Created by Administrator on 2016/10/26 0026.
 */
public abstract class AbstractRoad {

    protected AbstractVehicle mVehicle;

    public AbstractRoad(AbstractVehicle vehicle) {
        this.mVehicle = vehicle;
    }
    public abstract void run();

}
