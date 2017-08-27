package com.imooc.service;

import java.util.ArrayList;
import java.util.List;

import com.imooc.dao.MessageDao;

/**
 * ά�����ҵ����
 * 
 * @author ���ĺ�
 *
 */
public class MaintainService {
	/**
	 * ����ɾ��
	 * @param id
	 */
	public void deleteOne(String id) {
		if (id != null && !"".equals(id.trim())) {
			MessageDao messageDao = new MessageDao();
			messageDao.deleteOne(Integer.valueOf(id));
		}
	}
	
	/**
	 *  ����ɾ��
	 * @param ids
	 */
	public void deleteBath(String[] ids){
		MessageDao messageDao = new MessageDao();
		List<Integer> idList = new ArrayList<Integer>();
		for (String id : ids) {
			idList.add(Integer.valueOf(id));
		}
		messageDao.deleteBath(idList);
		
	}
	

}
