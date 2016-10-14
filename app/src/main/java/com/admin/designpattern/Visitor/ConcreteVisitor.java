package com.admin.designpattern.Visitor;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Administrator on 2016/10/14 0014.
 */
public class ConcreteVisitor implements Visitor {
    @Override
    public void visitString(StringElement se) {
        System.out.println("string = "+se.toString());
    }

    @Override
    public void visitFloat(FloatElement fe) {
        System.out.println("float = " +fe.toString());
    }

    @Override
    public void visitCollection(Collection collection) {
        Iterator iterator = collection.iterator();

        while (iterator.hasNext()){
            Object obj = iterator.next();

            if(obj instanceof Visitable){
                ((Visitable) obj).accept(this);
            }

        }
    }
}
