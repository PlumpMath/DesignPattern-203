package com.admin.designpattern.Flyweight;

/**
 * Created by Administrator on 2016/10/27 0027.
 */
public class ConcreteTicket implements TicketImpl {


    private String from ;
    private String to;
    private int price;
    private String bunk;

    public ConcreteTicket(String from, String to) {
        this.from = from;
        this.to = to;
        this.price = 120;
        this.bunk = "硬座";
    }

    @Override
    public void showTicket() {
        System.out.println("购买从 "+from+" 到 "+to +" 的 "+bunk+" 车票 ，"+"价格为 "+price );
    }


}
