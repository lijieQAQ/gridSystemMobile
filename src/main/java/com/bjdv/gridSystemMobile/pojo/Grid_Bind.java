package com.bjdv.gridSystemMobile.pojo;

public class Grid_Bind {
	private long bind_id;//绑定id
	private long grid_id;//网格ID
	private char type_id;//类型：1光节点
	private String ref_id;//引用ID
	private String ref_name;//引用名称
	public long getBind_id() {
		return bind_id;
	}
	public void setBind_id(long bind_id) {
		this.bind_id = bind_id;
	}
	public long getGrid_id() {
		return grid_id;
	}
	public void setGrid_id(long grid_id) {
		this.grid_id = grid_id;
	}
	public char getType_id() {
		return type_id;
	}
	public void setType_id(char type_id) {
		this.type_id = type_id;
	}
	public String getRef_id() {
		return ref_id;
	}
	public void setRef_id(String ref_id) {
		this.ref_id = ref_id;
	}
	public String getRef_name() {
		return ref_name;
	}
	public void setRef_name(String ref_name) {
		this.ref_name = ref_name;
	}
	
	
}
