package com.admin.designpattern.Decorator;

/**
 * 属于基本的人的装饰，但是穿什么外装，这就需要装饰了
 * Created by Administrator on 2016/10/28 0028.
 */
public class Boy extends Person {
    @Override
    public void dress() {
        System.out.println("穿上内衣内裤");
    }
}
