package com.bjdv.gridSystemMobile.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Grid {

	private long grid_id;//网格id
	private String grid_code;//网格编码
	private String name;//网格名称
	private char type;//网格类型：G普通网格，A协同网格，L逻辑网格
	private long pid;//上级网格ID
	private long region_id;//区域ID
	private String remark;//备注
	private Date create_date;//创建日期
	private long create_staff;//创建员工ID
	private char state;//状态：Y有效，N无效
	private Date state_date;//状态日期
	
	private List<Grid_Item_Data> itemDataList=new ArrayList<Grid_Item_Data>();
	private List<Grid_Map> mapList=null;
	private SysStaff staff;
	private SysRegion region;
	public long getGrid_id() {
		return grid_id;
	}
	public void setGrid_id(long grid_id) {
		this.grid_id = grid_id;
	}
	public String getGrid_code() {
		return grid_code;
	}
	public void setGrid_code(String grid_code) {
		this.grid_code = grid_code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	public long getRegion_id() {
		return region_id;
	}
	public void setRegion_id(long region_id) {
		this.region_id = region_id;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public long getCreate_staff() {
		return create_staff;
	}
	public void setCreate_staff(long create_staff) {
		this.create_staff = create_staff;
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
	
	public List<Grid_Item_Data> getItemDataList() {
		return itemDataList;
	}
	public void setItemDataList(List<Grid_Item_Data> itemDataList) {
		this.itemDataList = itemDataList;
	}
	
	public List<Grid_Map> getMapList() {
		return mapList;
	}
	public void setMapList(List<Grid_Map> mapList) {
		this.mapList = mapList;
	}
	public SysStaff getStaff() {
		return staff;
	}
	public void setStaff(SysStaff staff) {
		this.staff = staff;
	}
	public SysRegion getRegion() {
		return region;
	}
	public void setRegion(SysRegion region) {
		this.region = region;
	}
	
	
}
