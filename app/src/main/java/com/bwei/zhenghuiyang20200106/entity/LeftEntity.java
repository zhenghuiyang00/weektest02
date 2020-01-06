package com.bwei.zhenghuiyang20200106.entity;

import java.util.List;

public class LeftEntity {
    public String shenghuo;
    public String yifu;
    public String baobao;
    public String muying;

    private List<String> category;

    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }
}
