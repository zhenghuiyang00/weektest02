package com.bwei.zhenghuiyang20200106.model.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bwei.zhenghuiyang20200106.R;
import com.bwei.zhenghuiyang20200106.entity.LeftEntity;

import java.util.List;

import butterknife.BindView;

public class LeftAdapter extends RecyclerView.Adapter<LeftAdapter.MyViewHolder> {

    private Context context;
    private List<LeftEntity> list;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.left_item, null);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv.setText(list.get(position).getCategory().get(0));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.tv.setText(list.get(position).getCategory().get(0));
            }
        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    //回调接口
    class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv)
        TextView tv;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    private LeftClick leftClick;

    public void setLeftClick(LeftClick leftClick) {
        this.leftClick = leftClick;
    }

    public interface LeftClick{
        void leftClick(String id);
    }

}
