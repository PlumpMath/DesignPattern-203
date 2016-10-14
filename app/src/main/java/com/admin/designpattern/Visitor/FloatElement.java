package com.admin.designpattern.Visitor;

/**
 * Created by Administrator on 2016/10/14 0014.
 */
public class FloatElement implements Visitable {

    private Float fl;

    public FloatElement(Float fl) {
        this.fl = fl;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitFloat(this);
    }
}
