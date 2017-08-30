package com.bjdv.gridSystemMobile.pojo;

import java.util.List;


public class Notice extends AbstractNotice implements java.io.Serializable{
	private static final long serialVersionUID = 3527307901659011753L;
	private String contentByte;
	private String staffName;
	private String depName;
	private String targetFlag;
	private List<String> targetIds;
	
	public String getContentByte() {
		return contentByte;
	}
	public void setContentByte(String contentByte) {		
		this.contentByte = contentByte;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public String getTargetFlag() {
		return targetFlag;
	}

	public void setTargetFlag(String targetFlag) {
		this.targetFlag = targetFlag;
	}
	 
	public List<String> getTargetIds() {
		return targetIds;
	}
	 
	public void setTargetIds(List<String> targetIds) {
		this.targetIds = targetIds;
	}
	 
}