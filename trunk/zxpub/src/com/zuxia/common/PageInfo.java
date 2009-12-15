package com.zuxia.common;

import java.io.Serializable;

public class PageInfo implements Serializable {
	private static final long serialVersionUID = 7126509565385142115L;
	/**
	 * recordCount 记录总数 默认为0
	 * 
	 */
	private int recordCount = 0;
	/**
	 * pageSize 每页面最大记录数(需要设置) 默认为10条
	 * 
	 */
	private int pageSize = 10;
	/**
	 * pageCount 总页数 默认为1条
	 * 
	 */
	private int pageCount = 1;

	/**
	 * currentPage 当前是第几页(需要设置) 默认为1条
	 * 
	 */
	private int currentPage = 1;

	/**
	 * startRecord 开始记录数
	 * 
	 */
	private int startRecord;
	/**
	 * endRecrod 结束记录数
	 * 
	 */
	private int endRecrod;

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage<=this.pageCount?currentPage:this.pageCount;//判断，如果请求的页数大于总页数，则设置为总页数
		//之前则会出现10/2，请求页码大于总页码
		compute();
	}

	public int getEndRecrod() {
		return endRecrod;
	}

	public void setEndRecrod(int endRecrod) {
		this.endRecrod = endRecrod;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
		compute();
	}

	public int getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
		compute();
	}

	public int getStartRecord() {
		return startRecord;
	}

	public void setStartRecord(int startRecord) {
		this.startRecord = startRecord;
	}

	public PageInfo() {
	}

	private void compute() {
		if (recordCount == 0 || pageSize == 0 || currentPage == 0) {
			pageCount = 1;// 如果没有跟帖，0-->会出现1/0,会出现 1-->1/1
			startRecord = 0;
			endRecrod = 0;
		} else {
			pageCount = (recordCount + pageSize - 1) / pageSize;
			startRecord = (currentPage - 1) * pageSize + 1;
			int temp = startRecord + pageSize - 1;
			if (temp < recordCount) {
				endRecrod = temp;
			} else {
				endRecrod = recordCount;
			}
		}
	}
}
