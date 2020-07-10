package com.example.myapplication.base;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import butterknife.ButterKnife;

public abstract class BaseActivity<P extends BasePreasenter> extends AppCompatActivity implements BaseView {

    public P mPressenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("11111", "onCreate--------------------: ");
        setContentView(getLayout());//设置布局， 通过GetLayout来得到相应的布局具体有Activity提供
        ButterKnife.bind(this);//每个页面都需要绑定View
        initPresenter();//获得Presenter具体页面创建具体的P对象
        if (null != mPressenter) {
            mPressenter.bindView(this);//绑定View.P和V建立关系，P中的mView赋值
        }
        initView();
        initData();
        initListener();
    }

    protected abstract void initListener();

    protected abstract void initView();

    protected abstract void initData();

    protected abstract void initPresenter();

    protected abstract int getLayout();

}
