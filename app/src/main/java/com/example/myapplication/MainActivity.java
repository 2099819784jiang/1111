package com.example.myapplication;


import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.bean.FuliBean;
import com.example.myapplication.presenter.MainPresenter;
import com.example.myapplication.view.MainView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends BaseActivity<MainPresenter> implements MainView {

    @BindView(R.id.rec_main)
    RecyclerView mRecMain;

//这是一个MVP的抽取
//    此处没有onCreate方法 从BaseActivity继承过来了
//更新——————————————————————
    @Override
    protected void initListener() {
        Log.i("1111", "initListener--------------------:");
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        Log.i("111", "initData--------------:");
    }

    @Override
    protected void initPresenter() {
        Log.i("1111", "initPresenter-------------------------:");
        mPressenter =new MainPresenter();
    }

    @Override
    protected int getLayout() {
        Log.i("111", "getLayout-------------------------:");
        return R.layout.activity_main;
    }

    @Override
    public Void setData(FuliBean fuliBean) {
        return null;
    }

    @Override
    public void shouToast(String str) {

    }
}
