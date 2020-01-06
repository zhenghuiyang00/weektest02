package com.bwei.zhenghuiyang20200106.presenter;

import com.bwei.zhenghuiyang20200106.base.mvp.BasePresenter;
import com.bwei.zhenghuiyang20200106.contract.ClsContract;
import com.bwei.zhenghuiyang20200106.model.ClsModel;

import java.util.HashMap;

public class ClsPresenter extends BasePresenter<ClsModel, ClsContract.IView>implements ClsContract.IPresenter {
    @Override
    protected ClsModel initModel() {
        return new ClsModel();
    }

    @Override
    public void getLeftData() {
        model.getLeftData(new ClsContract.IModel.IModelCallback() {
            @Override
            public void success(Object o) {
                getView().success(o);
            }

            @Override
            public void failure(Throwable throwable) {
                getView().failure(throwable);
            }
        });
    }

    @Override
    public void getRightData(HashMap<String, String> params) {
        model.getRightData(params, new ClsContract.IModel.IModelCallback() {
            @Override
            public void success(Object o) {
                getView().success(o);
            }

            @Override
            public void failure(Throwable throwable) {
                getView().failure(throwable);
            }
        });
    }
}
