package com.admin.designpattern.Observer;

import java.util.Observable;

/**
 * Created by Administrator on 2016/10/14 0014.
 */
public class Product extends Observable {

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        setChanged();
        notifyObservers(name);
    }
}
