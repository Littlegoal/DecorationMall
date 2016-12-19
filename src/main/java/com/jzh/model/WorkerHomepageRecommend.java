package com.jzh.model;

import java.io.Serializable;

/**
 * 工人首页推荐模型
 * Created by hjy on 2016/12/15.
 */
public class WorkerHomepageRecommend implements Serializable{

    /**
     * default id
     */
    private static final long serialVersionUID = 1L;

    /**
     * 工人首页推荐工人项id
     */
    private Long id;

    /**
     * 商品二级分类id
     */
    private Long typeLevelTwoId;

    /**
     * 工人id
     */
    private Long workerId;

    /**
     * 工人名称
     */
    private String  workerName;

    /**
     * 装修案例id
     */
    private Long workId;

    /**
     * 装修案例名称
     */
    private String workName;

    /**
     * 案例主图片
     */
    private String workImg;

    /**
     * 删除标记位
     */
    private int isDeleted;

    /**
     * 最后更新时间
     */
    private String updateTime;

    /**
     * 工人头像
     */
    private String workerPhoto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTypeLevelTwoId() {
        return typeLevelTwoId;
    }

    public void setTypeLevelTwoId(Long typeLevelTwoId) {
        this.typeLevelTwoId = typeLevelTwoId;
    }

    public Long getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Long workerId) {
        this.workerId = workerId;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public Long getWorkId() {
        return workId;
    }

    public void setWorkId(Long workId) {
        this.workId = workId;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public String getWorkImg() {
        return workImg;
    }

    public void setWorkImg(String workImg) {
        this.workImg = workImg;
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

    public String getWorkerPhoto() {
        return workerPhoto;
    }

    public void setWorkerPhoto(String workerPhoto) {
        this.workerPhoto = workerPhoto;
    }
}
