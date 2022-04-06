package com.example.property.model;

public class Home {

    private Integer id;

    /**
     * 小区编号
     */
    private String communityId;

    /**
     * 房产编码
     */
    private String homeId;

    /**
     * 栋数
     */
    private String buildingId;

    /**
     * 房产名称
     */
    private String homeName;

    /**
     * 户主名称
     */
    private String householder;

    /**
     * 联系方式
     */
    private  String phone;

    /**
     * 房间数
     */
    private Integer homeNumber;

    /**
     * 单元
     */
    private Integer unitBuilding;

    /**
     * 楼层
     */
    private Integer floor;

    /**
     * 入住时间
     */
    private String rzTime;

    /**
     * 描述
     */
    private String desc;

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

    public String getHomeId() {
        return homeId;
    }

    public void setHomeId(String homeId) {
        this.homeId = homeId;
    }

    public String getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(String buildingId) {
        this.buildingId = buildingId;
    }

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    public String getHouseholder() {
        return householder;
    }

    public void setHouseholder(String householder) {
        this.householder = householder;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(Integer homeNumber) {
        this.homeNumber = homeNumber;
    }

    public Integer getUnitBuilding() {
        return unitBuilding;
    }

    public void setUnitBuilding(Integer unitBuilding) {
        this.unitBuilding = unitBuilding;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public String getRzTime() {
        return rzTime;
    }

    public void setRzTime(String rzTime) {
        this.rzTime = rzTime;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
