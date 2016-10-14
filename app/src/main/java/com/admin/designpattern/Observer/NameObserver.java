package com.admin.designpattern.Observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2016/10/14 0014.
 */
public class NameObserver implements Observer {


    private String name;

    @Override
    public void update(Observable observable, Object data) {

        if(data instanceof String){

            name = (String) data;

            System.out.println("name observer: name is change");

        }


    }
}
