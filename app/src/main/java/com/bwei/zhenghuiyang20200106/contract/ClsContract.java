package com.bwei.zhenghuiyang20200106.contract;

import com.bwei.zhenghuiyang20200106.base.mvp.IBaseModel;
import com.bwei.zhenghuiyang20200106.base.mvp.IBaseView;

import java.util.HashMap;

public interface ClsContract {
    interface IModel extends IBaseModel{
        void getLeftData(IModelCallback iModelCallback);
        void getRightData(HashMap<String,String>params,IModelCallback iModelCallback);
        interface IModelCallback{
            void success(Object o);
            void failure(Throwable throwable);
        }
    }
    interface IView extends IBaseView{
        void success(Object o);
        void failure(Throwable throwable);
    }
    interface IPresenter{
        void getLeftData();
        void getRightData(HashMap<String,String>params);
    }
}
