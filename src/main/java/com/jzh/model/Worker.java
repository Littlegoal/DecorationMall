package com.jzh.model;

import java.io.Serializable;

/**
 * @author Yunpeng Ma
 * @version 1.0
 */
public class Worker implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * 工人id
     */
    private Long workerId;

    /**
     * 工种
     */
    private Long workerTypeId;

    /**
     * 工人名字
     */
    private String workerName;

    /**
     * 联系方式
     */
    private String contact;

    /**
     * 服务区域
     */
    private String serviceArea;

    /**
     * 简介
     */
    private String introduction;

    /**
     * 评分数
     */
    private Double score;

    /**
     * 浏览量
     */
    private Long pageview;

    /**
     * 装修案例数量
     */
    private Long workCount;

    /**
     * 评论数
     */
    private Long commentCount;

    /**
     * 历史预约次数
     */
    private Long orderCount;

    /**
     * 删除标记位
     */
    private int isDeleted;

    /**
     * 最后更新时间
     */
    private String updateTime;

    /**
     * 工人照片
     */
    private String workerPhoto;

    public Long getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Long workerId) {
        this.workerId = workerId;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Long getWorkerTypeId() {
        return workerTypeId;
    }

    public void setWorkerTypeId(Long workerTypeId) {
        this.workerTypeId = workerTypeId;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Long getPageview() {
        return pageview;
    }

    public void setPageview(Long pageview) {
        this.pageview = pageview;
    }

    public Long getWorkCount() {
        return workCount;
    }

    public void setWorkCount(Long workCount) {
        this.workCount = workCount;
    }

    public Long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }

    public Long getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Long orderCount) {
        this.orderCount = orderCount;
    }

    public String getWorkerPhoto() {
        return workerPhoto;
    }

    public void setWorkerPhoto(String workerPhoto) {
        this.workerPhoto = workerPhoto;
    }
}
