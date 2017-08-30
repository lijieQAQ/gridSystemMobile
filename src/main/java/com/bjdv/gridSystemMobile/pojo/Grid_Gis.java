package com.bjdv.gridSystemMobile.pojo;

public class Grid_Gis {

	private long gis_id;//地理信息ID
	private long grid_id;//网格ID
	private char type;//类型：GGIS系统，M地图
	private String gis_no;//GIS系统编号
	public long getGis_id() {
		return gis_id;
	}
	public void setGis_id(long gis_id) {
		this.gis_id = gis_id;
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
	public String getGis_no() {
		return gis_no;
	}
	public void setGis_no(String gis_no) {
		this.gis_no = gis_no;
	}
	
	
}
