package com.imooc;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * InetAdress��
 * 
 * @author ���ĺ�
 *
 */
public class Test01 {

	public static void main(String[] args) throws UnknownHostException {

		InetAddress address = InetAddress.getLocalHost();
		System.out.println("�������:" + address.getHostName());
		System.out.println("�����IP��ַ:" + address.getHostAddress());
		byte[] addr = address.getAddress();
		System.out.println("�ֽ������ip��ַ:" + Arrays.toString(addr));
		System.out.println(address); // ֱ�ӻ�ȡ���������ip��ַ

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		// ���ݼ��������ȡInetAddress
		InetAddress address2 = InetAddress.getByName("PengWenHao");
		System.out.println("�������:" + address2.getHostName());
		System.out.println("�����IP��ַ:" + address2.getHostAddress());

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		// ���ݼ����IP��ַ��ȡInetAddress
		// InetAddress address3 = InetAddress.getLocalHost();
		// ����
		InetAddress address3 = InetAddress.getByName("192.168.80.1");
		System.out.println("�������:" + address3.getHostName());
		System.out.println("�����IP��ַ:" + address3.getHostAddress());

	}
}
