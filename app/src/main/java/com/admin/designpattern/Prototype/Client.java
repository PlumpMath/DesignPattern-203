package com.admin.designpattern.Prototype;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/10/24 0024.
 */
class Client {

    public Client() {
    }


    /*浅拷贝*/
    public void shallowClone() throws CloneNotSupportedException {
        Document1 doc11 = new Document1();
        doc11.setmText("这是一个浅拷贝文本");
        ArrayList<String> list = new ArrayList<>();
        list.add("图像 1");
        list.add("图像 2");
        list.add("图像 3");
        list.add("图像 4");
        list.add("图像 5");
        list.add("图像 6");
        doc11.setmList(list);
        doc11.show();
        System.out.println("进行拷贝...........");
        Document1 doc12 = doc11.clone();
        doc12.setmText("这是一个克隆后的浅拷贝文本");
        doc12.add("PNG");
        doc11.show();
        doc12.show();
    }

    public void deepClone() throws CloneNotSupportedException {
        Document2 doc21 = new Document2();
        doc21.setmText("这是一个深拷贝文本");
        ArrayList<String> list = new ArrayList<>();
        list.add("图像 1");
        list.add("图像 2");
        list.add("图像 3");
        list.add("图像 4");
        list.add("图像 5");
        list.add("图像 6");
        doc21.setmList(list);
        doc21.show();
        System.out.println("进行拷贝...........");
        Document2 doc22 = doc21.clone();
        doc22.setmText("这是一个克隆后的深拷贝文本");
        doc22.add("PNG");
        doc21.show();
        doc22.show();
    }



}
