package com.admin.designpattern.MVP;

/**
 * Created by Administrator on 2016/10/24 0024.
 */
public abstract class ConcreteNetwork implements NetworkImpl {
    @Override
    public void get(String url) {
        System.out.println("从网络获取数据");
    }

    @Override
    public void post(String url) {
        System.out.println("从网络获取数据");
    }

    public abstract void complete();

}
