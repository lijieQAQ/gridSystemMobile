package com.bjdv.gridSystemMobile.pojo;


public abstract class  AbstractNotice implements java.io.Serializable{
	private static final long serialVersionUID = 3527307901659011753L;
    private Long noticeId;
    private Long staffId;
    private Long regionId;
    private String title;
    private byte[] content;
    private String noticeType;
    private String prompt;
    private String sendDate;
    private String endDate;
    private String istop;
    private String hasAttachment;
    private String state;
    private String stateDate;
    private String target;
    private String remark;

    public Long getNoticeId(){
        return noticeId;
    }
     
    public void setNoticeId(Long noticeId) {
        this.noticeId = noticeId;
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
    public String getTitle(){
        return title;
    }
     
    public void setTitle(String title) {
        this.title = title;
    }
    public byte[] getContent(){
        return content;
    }
     
    public void setContent(byte[] content) {
        this.content = content;
    }
    public String getNoticeType(){
        return noticeType;
    }
     
    public void setNoticeType(String noticeType) {
        this.noticeType = noticeType;
    }
    public String getPrompt(){
        return prompt;
    }
     
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

	public String getSendDate() {
		return sendDate;
	}

	public void setSendDate(String sendDate) {
		this.sendDate = sendDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getIstop(){
        return istop;
    }
     
    public void setIstop(String istop) {
        this.istop = istop;
    }
    public String getHasAttachment(){
        return hasAttachment;
    }
     
    public void setHasAttachment(String hasAttachment) {
        this.hasAttachment = hasAttachment;
    }
    public String getState(){
        return state;
    }
     
    public void setState(String state) {
        this.state = state;
    }
    
	public String getStateDate() {
		return stateDate;
	}

	public void setStateDate(String stateDate) {
		this.stateDate = stateDate;
	}

	public String getTarget(){
        return target;
    }
     
    public void setTarget(String target) {
        this.target = target;
    }
    public String getRemark(){
        return remark;
    }
     
    public void setRemark(String remark) {
        this.remark = remark;
    }
}