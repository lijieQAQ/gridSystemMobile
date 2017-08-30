package com.bjdv.gridSystemMobile.util;

import java.util.List;

public class Page<T>{
	private int pageIndex;
	private int pageSize;
	private int pageCount;
	private int resultSize;
	
	private List<T> list;	

	public Page(int pageIndex, int pageSize) {
		super();
		this.pageIndex = pageIndex;
		this.pageSize = pageSize;
	}
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getResultSize() {
		return resultSize;
	}
	public void setResultSize(int resultSize) {
		this.resultSize = resultSize;
		if(this.resultSize%this.pageSize==0){
			this.pageCount=this.resultSize/this.pageSize;
		}else{
			this.pageCount=this.resultSize/this.pageSize+1;
		}
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	
}	
