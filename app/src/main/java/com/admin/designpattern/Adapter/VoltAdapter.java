package com.admin.designpattern.Adapter;

/**
 * Created by Administrator on 2016/10/28 0028.
 */
public class VoltAdapter  implements FiveVolt {

    Volt220 mVolt220;

    public VoltAdapter(Volt220 mVolt220) {
        this.mVolt220 = mVolt220;
    }

    public int getVolt220(){
        return mVolt220.getVolt220();
    }

    @Override
    public int getVolt5() {
        return 5;
    }
}
