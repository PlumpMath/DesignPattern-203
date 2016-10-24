package com.admin.designpattern.MVP;

/**
 * Created by Administrator on 2016/10/24 0024.
 */
public class ConcreteModel implements ModelImpl {
    @Override
    public void get() {
        System.out.println("从数据库获取数据");
    }

    @Override
    public void put() {
        System.out.println("将数据保存到数据库");
    }
}
