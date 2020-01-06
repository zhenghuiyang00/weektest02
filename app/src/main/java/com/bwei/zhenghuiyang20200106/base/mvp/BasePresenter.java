package com.bwei.zhenghuiyang20200106.base.mvp;

import java.lang.ref.WeakReference;

public abstract class BasePresenter<M extends IBaseModel,V extends IBaseView> {
    public M model;
    public WeakReference<V>weakReference;
    public BasePresenter(){
    model=initModel();
    }

    protected abstract M initModel();

    public void attach(V v){
        weakReference=new WeakReference<>(v);
    }
    public void deattach(){
        if (weakReference!=null){
            weakReference.clear();
            weakReference=null;
        }
    }

    public V getView(){
        return weakReference.get();
    }






}
