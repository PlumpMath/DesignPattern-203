package com.admin.designpattern.Factory;

/**
 * Created by Administrator on 2016/10/14 0014.
 */
public class Sample1 implements Sample {


    public Sample1(){
        print();
    }

    @Override
    public void print() {
        System.out.println("Sample 1");
    }
}
