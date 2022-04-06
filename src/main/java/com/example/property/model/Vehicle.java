package com.example.property.model;

import java.util.Date;

public class Vehicle {

    private Integer id;

    /**
     * 小区编号
     */
    private String communityId;

    /**
     * 所属成员
     */
    private String personnelId;

    /**
     * 车牌号码
     */
    private String vehHphm;

    /**
     * 车辆颜色
     */
    private String vehColor;

    /**
     * 描述
     */
    private String desc;

    /**
     * 创建时间
     */
    private Date creationTime;

    public Vehicle() {
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

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

    public String getPersonnelId() {
        return personnelId;
    }

    public void setPersonnelId(String personnelId) {
        this.personnelId = personnelId;
    }

    public String getVehHphm() {
        return vehHphm;
    }

    public void setVehHphm(String vehHphm) {
        this.vehHphm = vehHphm;
    }

    public String getVehColor() {
        return vehColor;
    }

    public void setVehColor(String vehColor) {
        this.vehColor = vehColor;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
