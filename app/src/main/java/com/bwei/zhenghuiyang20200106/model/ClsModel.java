package com.bwei.zhenghuiyang20200106.model;

import com.bwei.zhenghuiyang20200106.api.Api;
import com.bwei.zhenghuiyang20200106.contract.ClsContract;
import com.bwei.zhenghuiyang20200106.utils.RetrofitUtils;

import java.util.HashMap;

import retrofit2.Retrofit;

public class ClsModel implements ClsContract.IModel {

    @Override
    public void getLeftData(IModelCallback iModelCallback) {
        Retrofit retrofit=new Retrofit.Builder()

                .build();
    }

    @Override
    public void getRightData(HashMap<String, String> params, IModelCallback iModelCallback) {
        Retrofit retrofit=new Retrofit.Builder()

                .build();
    }
}
