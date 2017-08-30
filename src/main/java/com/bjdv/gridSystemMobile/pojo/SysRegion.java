package com.bjdv.gridSystemMobile.pojo;

import java.util.Date;

public abstract class  SysRegion implements java.io.Serializable{
    private Long regionId;
    private Long staffId;
    private String name;
    private String levelCode;
    private Long pid;
    private String regionCode;
    private String state;
    private Date stateDate;
    private String remark;
    private String sign;
    private String bakCode;
    private Long disporder;
    private String standby1;
    private String standby2;
    private String standby3;
    private Long tenantId;
    private String refId;

    public Long getRegionId(){
        return regionId;
    }
     
    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }
    public Long getStaffId(){
        return staffId;
    }
     
    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }
    public String getName(){
        return name;
    }
     
    public void setName(String name) {
        this.name = name;
    }
    public String getLevelCode(){
        return levelCode;
    }
     
    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode;
    }
    public Long getPid(){
        return pid;
    }
     
    public void setPid(Long pid) {
        this.pid = pid;
    }
    public String getRegionCode(){
        return regionCode;
    }
     
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }
    public String getState(){
        return state;
    }
     
    public void setState(String state) {
        this.state = state;
    }
    public Date getStateDate(){
        return stateDate;
    }
     
    public void setStateDate(Date stateDate) {
        this.stateDate = stateDate;
    }
    public String getRemark(){
        return remark;
    }
     
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public String getSign(){
        return sign;
    }
     
    public void setSign(String sign) {
        this.sign = sign;
    }
    public String getBakCode(){
        return bakCode;
    }
     
    public void setBakCode(String bakCode) {
        this.bakCode = bakCode;
    }
    public Long getDisporder(){
        return disporder;
    }
     
    public void setDisporder(Long disporder) {
        this.disporder = disporder;
    }
    public String getStandby1(){
        return standby1;
    }
     
    public void setStandby1(String standby1) {
        this.standby1 = standby1;
    }
    public String getStandby2(){
        return standby2;
    }
     
    public void setStandby2(String standby2) {
        this.standby2 = standby2;
    }
    public String getStandby3(){
        return standby3;
    }
     
    public void setStandby3(String standby3) {
        this.standby3 = standby3;
    }
    public Long getTenantId(){
        return tenantId;
    }
     
    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }
    public String getRefId(){
        return refId;
    }
     
    public void setRefId(String refId) {
        this.refId = refId;
    }
}