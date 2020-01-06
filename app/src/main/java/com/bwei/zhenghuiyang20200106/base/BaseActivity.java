package com.bwei.zhenghuiyang20200106.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bwei.zhenghuiyang20200106.base.mvp.BasePresenter;
import com.bwei.zhenghuiyang20200106.base.mvp.IBaseView;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity<P extends BasePresenter>extends AppCompatActivity implements IBaseView {
    public P presenter;
    Unbinder unbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layoutId());
        unbinder= ButterKnife.bind(this);
        presenter=initPresenter();
        if (presenter!=null){
            presenter.attach(this);
        }
        initView();
        initData();
    }

    protected abstract void initData();

    protected abstract void initView();

    protected abstract P initPresenter();

    protected abstract int layoutId();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (unbinder!=null){
            unbinder.unbind();
        }
        if (presenter!=null){
            presenter.deattach();
        }
    }


}
