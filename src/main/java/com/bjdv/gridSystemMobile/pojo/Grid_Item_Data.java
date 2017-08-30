package com.bjdv.gridSystemMobile.pojo;

import java.util.Date;

public class Grid_Item_Data {

	private long item_data_id;//指标id
	private long grid_id;//网格id
	private Date data_date;//指标日期
	private long data_value;//指标
	public long getItem_data_id() {
		return item_data_id;
	}
	public void setItem_data_id(long item_data_id) {
		this.item_data_id = item_data_id;
	}
	public long getGrid_id() {
		return grid_id;
	}
	public void setGrid_id(long grid_id) {
		this.grid_id = grid_id;
	}
	public Date getData_date() {
		return data_date;
	}
	public void setData_date(Date data_date) {
		this.data_date = data_date;
	}
	public long getData_value() {
		return data_value;
	}
	public void setData_value(long data_value) {
		this.data_value = data_value;
	}
	
	
}
