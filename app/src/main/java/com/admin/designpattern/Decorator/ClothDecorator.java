package com.admin.designpattern.Decorator;

/**
 * Created by Administrator on 2016/10/28 0028.
 */
public abstract class ClothDecorator extends Person {

    protected Person mPerson;

    public ClothDecorator(Person mPerson) {
        this.mPerson = mPerson;
    }

    @Override
    public void dress() {
        mPerson.dress();
    }
}
