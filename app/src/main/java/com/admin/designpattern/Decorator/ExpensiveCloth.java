package com.admin.designpattern.Decorator;

/**
 * Created by Administrator on 2016/10/28 0028.
 */
public class ExpensiveCloth extends ClothDecorator {

    public ExpensiveCloth(Person mPerson) {
        super(mPerson);
    }

    public void dress1(){
        System.out.println("穿上西装");
    }

    public void dress2(){
        System.out.println("带上帽子");
    }
    public void dress3(){
        System.out.println("穿上皮鞋");
    }

    @Override
    public void dress() {
        super.dress();
        dress1();
        dress2();
        dress3();
    }
}
