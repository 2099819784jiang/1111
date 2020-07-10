package com.example.myapplication.view;

import com.example.myapplication.base.BaseView;
import com.example.myapplication.bean.FuliBean;

public interface MainView extends BaseView {
    public Void setData(FuliBean fuliBean);//把网络请求的数据设置在列表中

}
