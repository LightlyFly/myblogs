package com.imooc;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 *  ʹ��url��ȡҳ���ϵ�����
 * @author ���ĺ�
 *
 */
public class Test03 {
	
	public static void main(String[] args) {
		
		try {
			URL url = new URL("http://www.baidu.com");
		   // ͨ��URL��openStream ������ȡURL��������ʾ����Դ�ֽ�������
			InputStream is =  url.openStream();
			// ���ֽ�������ת��Ϊ�ַ�������
			InputStreamReader isr = new InputStreamReader(is,"utf-8");
		    // Ϊ�ַ���������ӻ���
			BufferedReader br = new BufferedReader(isr);
			String data = br.readLine(); // ��ȡ����
			while(data!=null){
				System.out.println(data); // �������
				data = br.readLine(); 
			}
			br.close();
			isr.close();
			is.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}

}
