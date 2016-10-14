package com.admin.designpattern.Factory;

/**
 * Created by Administrator on 2016/10/14 0014.
 */
public class AbstractFactory extends Factory {
    @Override
    public Part1 creator1() {
        return new Part1();
    }

    @Override
    public Part2 creator2() {
        return new Part2();
    }
}
