package com.admin.designpattern.Builder;

/**
 * Created by Administrator on 2016/10/14 0014.
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(){
        builder.buildPart1();
        builder.buildPart2();
        builder.buildPart3();
    }

}
