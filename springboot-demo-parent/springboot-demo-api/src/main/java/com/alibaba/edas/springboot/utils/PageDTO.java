package com.alibaba.edas.springboot.utils;

import java.util.List;

public class PageDTO<T> {

	private Integer totalCount;
	private Integer pageSize;
	private Integer currentPage;
	private List<T> datas;

	public PageDTO() {
		super();
	}

	public PageDTO(Integer totalCount, Integer pageSize, Integer currentPage, List<T> datas) {
		super();
		this.totalCount = totalCount;
		this.pageSize = pageSize;
		this.currentPage = currentPage;
		this.datas = datas;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public List<T> getDatas() {
		return datas;
	}

	public void setDatas(List<T> datas) {
		this.datas = datas;
	}

}
