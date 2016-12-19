package com.jzh.model;

import java.io.Serializable;

/**
 * Created by hjy on 2016/12/13.
 */
public class Work implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * 装修案例id
     */
    private long workId;

    /**
     * 工人id
     */
    private long workerId;

    /**
     * 案例名称
     */
    private String name;

    /**
     *  所属楼盘
     */
    private  String premises;

    /**
     * 面积
     */
    private  String area;

    /**
     * 简介
     */
    private  String introduction;

    /**
     * 主图片
     */
    private String imgPrincipal;

    /**
     * 细节图
     */
    private  String imgDetail;

    /**
     *用户感兴趣数
     */
    private long interestAmount;

    /**
     * 删除标记位
     */
    private int isDeleted;

    /**
     * 最后更新时间
     */
    private String updateTime;

    public long getWorkId() {
        return workId;
    }

    public void setWorkId(long workId) {
        this.workId = workId;
    }

    public long getWorkerId() {
        return workerId;
    }

    public void setWorkerId(long workerId) {
        this.workerId = workerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPremises() {
        return premises;
    }

    public void setPremises(String premises) {
        this.premises = premises;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getImgPrincipal() {
        return imgPrincipal;
    }

    public void setImgPrincipal(String imgPrincipal) {
        this.imgPrincipal = imgPrincipal;
    }

    public String getImgDetail() {
        return imgDetail;
    }

    public void setImgDetail(String imgDetail) {
        this.imgDetail = imgDetail;
    }

    public long getInterestAmount() {
        return interestAmount;
    }

    public void setInterestAmount(long interestAmount) {
        this.interestAmount = interestAmount;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
