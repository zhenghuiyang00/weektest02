package com.bwei.zhenghuiyang20200106;

import android.os.Bundle;
import android.os.HandlerThread;

import androidx.recyclerview.widget.RecyclerView;

import com.bwei.zhenghuiyang20200106.base.BaseActivity;
import com.bwei.zhenghuiyang20200106.base.mvp.BasePresenter;
import com.bwei.zhenghuiyang20200106.contract.ClsContract;
import com.bwei.zhenghuiyang20200106.entity.LeftEntity;
import com.bwei.zhenghuiyang20200106.entity.RightEntity;
import com.bwei.zhenghuiyang20200106.model.adapter.LeftAdapter;
import com.bwei.zhenghuiyang20200106.model.adapter.RightAdapter;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.http.Header;

public class MainActivity extends BaseActivity<BasePresenter> implements ClsContract.IView {


    @BindView(R.id.rv_left)
    RecyclerView rvLeft;
    @BindView(R.id.rv_right)
    RecyclerView rvRight;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        //注册eventBus
        EventBus.getDefault().register(this);
    }

    @Override
    protected BasePresenter initPresenter() {
        return null;
    }

    @Override
    protected int layoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void success(Object o) {
        if (o instanceof LeftEntity){
            LeftEntity leftEntity= (LeftEntity) o;
            LeftAdapter leftAdapter = new LeftAdapter();
            rvLeft.setAdapter(leftAdapter);
            leftAdapter.setLeftClick(new LeftAdapter.LeftClick() {
                @Override
                public void leftClick(String id) {
                    //发送
                    EventBus.getDefault().post(id);
                }
            });


        }else if(o instanceof RightEntity){
            RightEntity rightEntity= (RightEntity) o;
            RightAdapter rightAdapter=new RightAdapter();
            rvRight.setAdapter(rightAdapter);
        }
    }

    @Subscribe()





    @Override
    public void failure(Throwable throwable) {

    }


}
