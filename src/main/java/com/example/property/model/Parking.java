package com.example.property.model;

import java.util.Date;

public class Parking {

    private Integer id;
    /**
     * 小区编号
     */
    private String communityId;

    /**
     * 车位编号
     */
    private String parkId;

    /**
     * 车位名称
     */
    private String parkName;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date creationTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommunityId() {
        return communityId;
    }

    public void setCommunityId(String communityId) {
        this.communityId = communityId;
    }

    public String getParkId() {
        return parkId;
    }

    public void setParkId(String parkId) {
        this.parkId = parkId;
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }
}
