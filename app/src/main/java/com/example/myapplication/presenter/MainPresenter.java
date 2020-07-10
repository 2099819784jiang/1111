package com.example.myapplication.presenter;

import com.example.myapplication.base.BasePreasenter;
import com.example.myapplication.model.MainModel;
import com.example.myapplication.view.MainView;

public class MainPresenter extends BasePreasenter<MainView> {
    public MainModel mainModel;

    @Override
    protected void initModel() {
        mainModel = new MainModel();

        mModels.add(mainModel);
    }
}
