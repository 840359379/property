package com.example.property.model;

import java.util.Date;

public class Community {

    private Integer id;

    /**
     * 小区管理员
     */
    private Integer userId;

    /**
     * 小区名称
     */
    private String communityName;

    /**
     * 坐落地址
     */
    private String cellAddress;

    /**
     * 占地面积
     */
    private Integer areaCovered;

    /**
     * 开发商名称
     */
    private String developers;

    /**
     * 物业公司名称
     */
    private String property;

    /**
     * 绿化率
     */
    private Integer afforestationRate;

    /**
     * 总栋数
     */
    private Integer tung;

    /**
     * 总户数
     */
    private Integer household;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 小区简介
     */
    private String desc;

    private Date creationTime;

    /**
     * 小区编号
     */
    private String communityId;

    public Community() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getCellAddress() {
        return cellAddress;
    }

    public void setCellAddress(String cellAddress) {
        this.cellAddress = cellAddress;
    }

    public Integer getAreaCovered() {
        return areaCovered;
    }

    public void setAreaCovered(Integer areaCovered) {
        this.areaCovered = areaCovered;
    }

    public String getDevelopers() {
        return developers;
    }

    public void setDevelopers(String developers) {
        this.developers = developers;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public Integer getAfforestationRate() {
        return afforestationRate;
    }

    public void setAfforestationRate(Integer afforestationRate) {
        this.afforestationRate = afforestationRate;
    }

    public Integer getTung() {
        return tung;
    }

    public void setTung(Integer tung) {
        this.tung = tung;
    }

    public Integer getHousehold() {
        return household;
    }

    public void setHousehold(Integer household) {
        this.household = household;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public String getCommunityId() {
        return communityId;
    }

    public void setCommunityId(String communityId) {
        this.communityId = communityId;
    }
}
