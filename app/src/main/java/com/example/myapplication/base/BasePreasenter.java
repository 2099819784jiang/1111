package com.example.myapplication.base;

import java.util.ArrayList;

public abstract class BasePreasenter<V extends BaseView> {
    public V mView;//每一个p都要有一个view,view 的类别必须是BaseView 的后代，此处不知道具体是那个V
    public ArrayList<BaseModel> mModels = new ArrayList<>();
    public BasePreasenter(){
//         给V赋值，给M赋值，此处不在给V赋值，有点太早了，后面合适的时候通过bindView赋值。
        initModel();
    }

    public void bindView(V view) {
        mView = view;
    }

    protected abstract void initModel();

    public void addmodel(BaseModel baseModel) {
        mModels.add(baseModel);
    }
}
