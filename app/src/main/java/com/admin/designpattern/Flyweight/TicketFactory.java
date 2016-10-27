package com.admin.designpattern.Flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Administrator on 2016/10/27 0027.
 */
public class TicketFactory {

    public static Map<String,ConcreteTicket> mPool = new ConcurrentHashMap<>();


    public static TicketImpl getTicket(String from,String to ){
        String key = from +"-"+to;


        if(mPool.containsKey(key)){
            System.out.println("从缓冲池获取对象");
            return mPool.get(key);
        }else {
            System.out.println("创建新的对象");
            TicketImpl ticket =  new ConcreteTicket(from,to);
            mPool.put(key, (ConcreteTicket) ticket);

            return ticket;
        }


    }



}
