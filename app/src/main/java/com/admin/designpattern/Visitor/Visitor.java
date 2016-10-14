package com.admin.designpattern.Visitor;

import java.util.Collection;

/**
 * Created by Administrator on 2016/10/14 0014.
 */
public interface Visitor {
    void visitString(StringElement se);
    void visitFloat(FloatElement fe);
    void visitCollection(Collection collection);
}
