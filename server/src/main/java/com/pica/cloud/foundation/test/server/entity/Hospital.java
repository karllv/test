package com.pica.cloud.foundation.test.server.entity;

import java.util.Date;

public class Hospital {
    private Integer id;

    private Integer provinceId;

    private String provinceName;

    private Long cityId;

    private String cityName;

    private Long countyId;

    private String countyName;

    private Long townId;

    private String townName;

    private Long villageId;

    private String villageName;

    private String name;

    private String hospitalAddress;

    private Integer type;

    private Integer deleteFlag;

    private Integer creatId;

    private Date creatTime;

    private Integer modifyId;

    private Date modifyTime;

    private Integer hospitalStatisticsType;

    private Integer hospitalRank;

    private String hospitalAlias;

    private Integer parentId;

    private String hospitalClass;

    private String hospitalLevel;

    private String hospitalGrade;

    private Integer orgType;

    private Integer levelGrade;

    private String contacts;

    private String tel;

    private Integer sourceType;

    private Integer enable;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public Long getCountyId() {
        return countyId;
    }

    public void setCountyId(Long countyId) {
        this.countyId = countyId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName == null ? null : countyName.trim();
    }

    public Long getTownId() {
        return townId;
    }

    public void setTownId(Long townId) {
        this.townId = townId;
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName == null ? null : townName.trim();
    }

    public Long getVillageId() {
        return villageId;
    }

    public void setVillageId(Long villageId) {
        this.villageId = villageId;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName == null ? null : villageName.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress == null ? null : hospitalAddress.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getCreatId() {
        return creatId;
    }

    public void setCreatId(Integer creatId) {
        this.creatId = creatId;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Integer getModifyId() {
        return modifyId;
    }

    public void setModifyId(Integer modifyId) {
        this.modifyId = modifyId;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getHospitalStatisticsType() {
        return hospitalStatisticsType;
    }

    public void setHospitalStatisticsType(Integer hospitalStatisticsType) {
        this.hospitalStatisticsType = hospitalStatisticsType;
    }

    public Integer getHospitalRank() {
        return hospitalRank;
    }

    public void setHospitalRank(Integer hospitalRank) {
        this.hospitalRank = hospitalRank;
    }

    public String getHospitalAlias() {
        return hospitalAlias;
    }

    public void setHospitalAlias(String hospitalAlias) {
        this.hospitalAlias = hospitalAlias == null ? null : hospitalAlias.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getHospitalClass() {
        return hospitalClass;
    }

    public void setHospitalClass(String hospitalClass) {
        this.hospitalClass = hospitalClass == null ? null : hospitalClass.trim();
    }

    public String getHospitalLevel() {
        return hospitalLevel;
    }

    public void setHospitalLevel(String hospitalLevel) {
        this.hospitalLevel = hospitalLevel == null ? null : hospitalLevel.trim();
    }

    public String getHospitalGrade() {
        return hospitalGrade;
    }

    public void setHospitalGrade(String hospitalGrade) {
        this.hospitalGrade = hospitalGrade == null ? null : hospitalGrade.trim();
    }

    public Integer getOrgType() {
        return orgType;
    }

    public void setOrgType(Integer orgType) {
        this.orgType = orgType;
    }

    public Integer getLevelGrade() {
        return levelGrade;
    }

    public void setLevelGrade(Integer levelGrade) {
        this.levelGrade = levelGrade;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }
}