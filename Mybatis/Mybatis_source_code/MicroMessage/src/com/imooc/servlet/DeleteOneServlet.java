package com.imooc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.imooc.service.MaintainService;

/**
 * ����ɾ�����Ʋ�
 * 
 * @author ���ĺ�
 */
@WebServlet("/DeleteOneServlet.action")
public class DeleteOneServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ���ñ���
		req.setCharacterEncoding("UTF-8");
		// ����ҳ���ֵ
		String id = req.getParameter("id");
		MaintainService maintainService = new MaintainService();
		maintainService.deleteOne(id);
		// ��ҳ����ת
		req.getRequestDispatcher("/List.action").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}

}