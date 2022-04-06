package com.example.property.model;

import java.util.Date;

public class Building {

    private Integer id;

    /**
     * 栋数编号
     */
    private String buildingsId;

    /**
     * 小区编号
     */
    private String communityId;

    /**
     * 栋数名称
     */
    private String buildingsName;

    /**
     * 总户数
     */
    private Integer households;

    /**
     * 描述
     */
    private String desc;

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

    public String getBuildingsId() {
        return buildingsId;
    }

    public void setBuildingsId(String buildingsId) {
        this.buildingsId = buildingsId;
    }

    public String getCommunityId() {
        return communityId;
    }

    public void setCommunityId(String communityId) {
        this.communityId = communityId;
    }

    public String getBuildingsName() {
        return buildingsName;
    }

    public void setBuildingsName(String buildingsName) {
        this.buildingsName = buildingsName;
    }

    public Integer getHouseholds() {
        return households;
    }

    public void setHouseholds(Integer households) {
        this.households = households;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Building() {
    }
}
