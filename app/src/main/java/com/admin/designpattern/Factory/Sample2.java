package com.admin.designpattern.Factory;

/**
 * Created by Administrator on 2016/10/14 0014.
 */
public class Sample2 implements Sample {


    public Sample2(){
        print();
    }

    @Override
    public void print() {
        System.out.println("Sample 2");
    }
}
