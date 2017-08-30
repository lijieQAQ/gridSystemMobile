package com.bjdv.gridSystemMobile.pojo;

import java.util.Date;

public class Grid_Resource {

	private long resource_id;//资源id
	private long grid_id;//网格id
	private char type;//类型：S销售人员，O运维人员
	private String resource_no;//资源编号
	private char state;//状态：Y有效，N无效
	private Date state_date;//状态时间
	public long getResource_id() {
		return resource_id;
	}
	public void setResource_id(long resource_id) {
		this.resource_id = resource_id;
	}
	public long getGrid_id() {
		return grid_id;
	}
	public void setGrid_id(long grid_id) {
		this.grid_id = grid_id;
	}
	public char getType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}
	public String getResource_no() {
		return resource_no;
	}
	public void setResource_no(String resource_no) {
		this.resource_no = resource_no;
	}
	public char getState() {
		return state;
	}
	public void setState(char state) {
		this.state = state;
	}
	public Date getState_date() {
		return state_date;
	}
	public void setState_date(Date state_date) {
		this.state_date = state_date;
	}
	
	
}
