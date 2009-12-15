package com.zuxia.common;

import java.io.Serializable;

public class PageInfo implements Serializable {
	private static final long serialVersionUID = 7126509565385142115L;
	/**
	 * recordCount ��¼���� Ĭ��Ϊ0
	 * 
	 */
	private int recordCount = 0;
	/**
	 * pageSize ÿҳ������¼��(��Ҫ����) Ĭ��Ϊ10��
	 * 
	 */
	private int pageSize = 10;
	/**
	 * pageCount ��ҳ�� Ĭ��Ϊ1��
	 * 
	 */
	private int pageCount = 1;

	/**
	 * currentPage ��ǰ�ǵڼ�ҳ(��Ҫ����) Ĭ��Ϊ1��
	 * 
	 */
	private int currentPage = 1;

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
		this.currentPage = currentPage<=this.pageCount?currentPage:this.pageCount;//�жϣ���������ҳ��������ҳ����������Ϊ��ҳ��
		//֮ǰ������10/2������ҳ�������ҳ��
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
			pageCount = 1;// ���û�и�����0-->�����1/0,����� 1-->1/1
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
