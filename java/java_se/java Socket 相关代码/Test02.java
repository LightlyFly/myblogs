package com.imooc;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * URL���õ� ����
 * 
 * @author ���ĺ�
 *
 */
public class Test02 {
	public static void main(String[] args) {
		// ����һ��URLʵ��
		try {
			URL imooc = new URL("http://www.imooc.com");
			// ? �����ʾ������#�����ʾ���
			URL url = new URL(imooc, "/index.html?username=tom#test");
			System.out.println("Э��:" + url.getProtocol());
			System.out.println("����:" + url.getHost());
			// ���û��ָ���˿ں�,��ʹ��Ĭ�ϵĶ˿ں�,��ʱgetPort() ���ص���-1
			System.out.println("�˿�:" + url.getPort());
			System.out.println("�ļ�·��:" + url.getPath());
            System.out.println("���·��:"+url.getRef());
            System.out.println("��ѯ�ַ���:"+url.getQuery());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
