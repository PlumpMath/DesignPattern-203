package com.admin.designpattern.MVP;

/**
 * Created by Administrator on 2016/10/24 0024.
 */
public class ConcreteView implements ViewImpl {
    @Override
    public void showLoading() {
        System.out.println("正在从网络加载数据");
    }

    @Override
    public void hideLoading() {
        System.out.println("加载完成");
    }

    @Override
    public void showArticle() {
        System.out.println("展示数据");
    }
}
