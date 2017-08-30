package com.bjdv.gridSystemMobile.pojo;

public class Grid_Map {

	private long map_id;//范围点ID
	private long grid_id;//地理信息ID
	private long disporder;//显示顺序
	private float lng;//经度
	private float lat;//维度
	public long getMap_id() {
		return map_id;
	}
	public void setMap_id(long map_id) {
		this.map_id = map_id;
	}
	public long getGrid_id() {
		return grid_id;
	}
	public void setGrid_id(long grid_id) {
		this.grid_id = grid_id;
	}
	public long getDisporder() {
		return disporder;
	}
	public void setDisporder(long disporder) {
		this.disporder = disporder;
	}
	public float getLng() {
		return lng;
	}
	public void setLng(float lng) {
		this.lng = lng;
	}
	public float getLat() {
		return lat;
	}
	public void setLat(float lat) {
		this.lat = lat;
	}
	
	
}
