package com.admin.designpattern.Prototype;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/10/24 0024.
 */
public class Document2 implements Cloneable{
    //非引用类型变量，即基本类型，而String则为特殊情况，他的修改，都是在新分配的内存中进行操作
    private String mText;
    //引用类型变量，每次复制，都是复制引用，只有在将其所映射的内存空间都复制了，才属于深拷贝
    private ArrayList<String> mList;
    public Document2() {
        mList = new ArrayList<>();
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public ArrayList<String> getmList() {
        return mList;
    }

    public void setmList(ArrayList<String> mList) {
        this.mList = mList;
    }

    public void add(String str){
        mList.add(str);
    }

    public void show(){

        System.out.println("text = "+mText);
        for(String str : mList){
            System.out.println("array = "+str);
        }
    }

    /*深拷贝*/
    @Override
    protected Document2 clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        Document2 doc = (Document2) super.clone();
        doc.mText = this.mText;
        /*对list也进行了clone，能够真正的复制出两个一模一样的对象*/
        doc.mList = (ArrayList<String>) this.mList.clone();
        return doc;
    }
}
