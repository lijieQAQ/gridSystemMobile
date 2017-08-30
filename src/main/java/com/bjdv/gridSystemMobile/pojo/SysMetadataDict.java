package com.bjdv.gridSystemMobile.pojo;

import java.util.Date;

public class SysMetadataDict{
    private Long metId;
    private Long staffId;
    private Long regionId;
    private String context;
    private String lemma;
    private String meanings;
    private Long disporder;
    private String state;
    private Date stateDate;
    private String remark;
    private String standby1;
    private String standby2;
    private String standby3;
    private Long tenantId;
    private Long moduleId;

    public Long getMetId(){
        return metId;
    }
     
    public void setMetId(Long metId) {
        this.metId = metId;
    }
    public Long getStaffId(){
        return staffId;
    }
     
    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }
    public Long getRegionId(){
        return regionId;
    }
     
    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }
    public String getContext(){
        return context;
    }
     
    public void setContext(String context) {
        this.context = context;
    }
    public String getLemma(){
        return lemma;
    }
     
    public void setLemma(String lemma) {
        this.lemma = lemma;
    }
    public String getMeanings(){
        return meanings;
    }
     
    public void setMeanings(String meanings) {
        this.meanings = meanings;
    }
    public Long getDisporder(){
        return disporder;
    }
     
    public void setDisporder(Long disporder) {
        this.disporder = disporder;
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
    public Long getModuleId(){
        return moduleId;
    }
     
    public void setModuleId(Long moduleId) {
        this.moduleId = moduleId;
    }
}