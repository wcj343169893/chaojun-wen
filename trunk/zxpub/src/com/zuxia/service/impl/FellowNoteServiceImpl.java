package com.zuxia.service.impl;

import com.zuxia.dao.IFellowNoteDao;
import com.zuxia.service.IFellowNoteService;

/**
 * FellowNoteService��Ҫ˵��
 * 
 * 
 * @author �ĳ���
 */
public class FellowNoteServiceImpl implements IFellowNoteService {
	private IFellowNoteDao fellowNotedao;

	/**
	 * fellowNotedao���Ե�get����
	 * 
	 * @return the fellowNotedao
	 */
	public IFellowNoteDao getFellowNotedao() {
		return fellowNotedao;
	}

	/**
	 * fellowNotedao���Ե�set����
	 * 
	 * @param fellowNotedao
	 *            the fellowNotedao to set
	 */
	public void setFellowNotedao(IFellowNoteDao fellowNotedao) {
		this.fellowNotedao = fellowNotedao;
	}

}
