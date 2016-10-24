package com.admin.designpattern.Strategy;

/**
 * Created by Administrator on 2016/10/24 0024.
 */
public class Context {

    private Strategy mStrategy;

    public Context(Strategy strategy) {
        this.mStrategy = strategy;
    }

    /*在这里调用执行不同的策略，这是典型的面向接口编程，通过接口的不断扩展，实现类似与ifelse的分配，并且降低耦合*/
    public void executeStrategy(){
        mStrategy.strategy();
    }
}
