package com.imooc.service;

import java.util.List;

import com.imooc.bean.Message;
import com.imooc.dao.MessageDao;

/**
 *  �б���ص�ҵ����
 * @author ���ĺ�
 *
 */
public class ListService {
	public List<Message> queryMessageList(String command, String description){
		MessageDao messageDao = new MessageDao();
		List<Message> list = messageDao.queryMessageList(command, description);
		
		return list;
		
	}

}
