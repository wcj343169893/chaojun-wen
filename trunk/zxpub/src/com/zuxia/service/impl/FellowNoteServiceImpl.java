package com.zuxia.service.impl;

import com.zuxia.dao.IFellowNoteDao;
import com.zuxia.service.IFellowNoteService;

/**
 * FellowNoteService概要说明
 * 
 * 
 * @author 文朝军
 */
public class FellowNoteServiceImpl implements IFellowNoteService {
	private IFellowNoteDao fellowNotedao;

	/**
	 * fellowNotedao属性的get方法
	 * 
	 * @return the fellowNotedao
	 */
	public IFellowNoteDao getFellowNotedao() {
		return fellowNotedao;
	}

	/**
	 * fellowNotedao属性的set方法
	 * 
	 * @param fellowNotedao
	 *            the fellowNotedao to set
	 */
	public void setFellowNotedao(IFellowNoteDao fellowNotedao) {
		this.fellowNotedao = fellowNotedao;
	}

}
