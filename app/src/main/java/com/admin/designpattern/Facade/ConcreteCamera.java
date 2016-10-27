package com.admin.designpattern.Facade;

/**
 * Created by Administrator on 2016/10/27 0027.
 */
public class ConcreteCamera implements CameraImpl {
    @Override
    public void openCamera() {
        System.out.println("打开相机");
    }

    @Override
    public void takePicture() {
        System.out.println("照相");
    }

    @Override
    public void stopCamera() {
        System.out.println("关闭相机");
    }
}
