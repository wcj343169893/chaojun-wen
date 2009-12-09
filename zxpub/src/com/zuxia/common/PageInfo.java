package com.zuxia.common;

import java.io.Serializable;

public class PageInfo implements Serializable {
	private static final long serialVersionUID = 7126509565385142115L;
	/**
	 * recordCount ��¼����
	 * 
	 */
	private int recordCount;
	/**
	 * pageSize ÿҳ������¼��(��Ҫ����)
	 * 
	 */
	private int pageSize;
	/**
	 * pageCount ��ҳ��
	 * 
	 */
	private int pageCount;

	/**
	 * currentPage ��ǰ�ǵڼ�ҳ(��Ҫ����)
	 * 
	 */
	private int currentPage;

	/**
	 * startRecord ��ʼ��¼��
	 * 
	 */
	private int startRecord;
	/**
	 * endRecrod ������¼��
	 * 
	 */
	private int endRecrod;

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
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
			pageCount = 0;
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
