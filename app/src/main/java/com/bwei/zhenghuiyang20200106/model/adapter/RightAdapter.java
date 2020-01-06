package com.bwei.zhenghuiyang20200106.model.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bwei.zhenghuiyang20200106.R;
import com.bwei.zhenghuiyang20200106.entity.RightEntity;

import java.util.List;

import butterknife.BindView;

public class RightAdapter extends RecyclerView.Adapter<RightAdapter.MyViewHolder> {

    private Context context;
    private List<RightEntity.DataBean> list;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.right_item, null);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv.setText(list.get(position).getGoods_name());
        Glide.with(context).load(list.get(position).getCurrency_price())
                .error(R.mipmap.ic_launcher)
                .placeholder(R.mipmap.ic_launcher)
                .into(holder.iv);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.iv)
        ImageView iv;
        @BindView(R.id.tv)
        TextView tv;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
