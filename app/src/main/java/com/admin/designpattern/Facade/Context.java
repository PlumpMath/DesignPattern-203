package com.admin.designpattern.Facade;

/**
 * 其实就是最简单的封装，作为一个最上层，想用户开放所有的接口，并且，封闭用户对于底层的操作
 * Created by Administrator on 2016/10/27 0027.
 */
public class Context {

    private PhoneImpl mPhone = new ConcretePhone();
    private CameraImpl mCamera = new ConcreteCamera();


    public void dail() {
        mPhone.dail();
    }

    public void hangup() {
        mPhone.huangup();
    }


    public void openCamera() {
        mCamera.openCamera();
    }

    public void takePicture() {
        mCamera.takePicture();
    }

    public void stopCamera() {
        mCamera.stopCamera();
    }

}
