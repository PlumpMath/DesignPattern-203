package com.admin.designpattern.Prototype;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/10/24 0024.
 */
public class Document1 implements Cloneable{

    //非引用类型变量，即基本类型，而String则为特殊情况，他的修改，都是在新分配的内存中进行操作
    private String mText;
    //引用类型变量，每次复制，都是复制引用，只有在将其所映射的内存空间都复制了，才属于深拷贝
    private ArrayList<String> mList;

    public Document1() {
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

    /*浅拷贝*/
    @Override
    protected Document1 clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        Document1 doc = (Document1) super.clone();
        doc.mText = this.mText;
        /*对于list对象，没有实现clone，因此，就算将Document1 进行了Clone，也只是共用一个内存空间*/
        doc.mList = this.mList;
        return doc;
    }


}
