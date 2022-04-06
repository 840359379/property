package com.example.property.model;

import java.util.Date;

public class Personnel {

    private Integer id;

    /**
     * 小区编号
     */
    private String communityId;

    /**
     * 房产编号
     */
    private String homeId;

    /**
     * 成员编号
     */
    private String personnelId;

    /**
     * 成员名称
     */
    private String memberName;

    /**
     * 出生日期
     */
    private String birthday;

    /**
     * 联系方式
     */
    private String phone;

    /**
     * 职业
     */
    private String occupation;

    /**
     * 性别
     */
    private String sex;

    /**
     * 成员类型
     */
    private String personnelType;

    /**
     * 描述
     */
    private String desc;

    /**
     * 创建时间
     */
    private Date creationTime;

    public String getPersonnelId() {
        return personnelId;
    }

    public void setPersonnelId(String personnelId) {
        this.personnelId = personnelId;
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

    public String getHomeId() {
        return homeId;
    }

    public void setHomeId(String homeId) {
        this.homeId = homeId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPersonnelType() {
        return personnelType;
    }

    public void setPersonnelType(String personnelType) {
        this.personnelType = personnelType;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Personnel() {
    }
}
