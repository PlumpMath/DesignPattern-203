package com.admin.designpattern.Visitor;

/**
 * Created by Administrator on 2016/10/14 0014.
 */
public class StringElement implements Visitable {

    private String str;

    public StringElement(String str) {
        this.str = str;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitString(this);
    }
}
