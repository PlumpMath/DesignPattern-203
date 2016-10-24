package com.admin.designpattern.MVP;

/**
 * 是view和model交互的唯一桥梁，这也是mvp与mvc的唯一区别，负责所有的中间操作，将model中的数据取出，通知view更新；
 * 或者是接受view的用户响应，将数据存到model中去
 * Created by Administrator on 2016/10/24 0024.
 */
public class Presenter {

    /*mvp中的viewer角色，职责是负责更新UI*/
    private ViewImpl mView;
    /*mvp中的model角色，职责是维护对数据的存取操作*/
    private ModelImpl mModel = new ConcreteModel();
    /*属于presenter中的业务逻辑，从网络获取数据*/
    private NetworkImpl mNetwork ;

    /*绑定view*/
    public Presenter(ViewImpl mView) {
        this.mView = mView;
    }

    public void fech(String url){
        mView.showLoading();
        mNetwork.get(url);
        mNetwork = new ConcreteNetwork() {
            @Override
            public void complete() {
                mView.hideLoading();
                mView.showArticle();
                mModel.put();
            }
        };
    }


}
