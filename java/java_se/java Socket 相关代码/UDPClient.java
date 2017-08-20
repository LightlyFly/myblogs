package com.imooc;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * �ͻ���
 * 
 * @author ���ĺ�
 *
 */
public class UDPClient {

	public static void main(String[] args) {
		try {
			/**
			 * �����˷�������
			 */

			// 1.����������ĵ�ַ,�˿ں�,����
			InetAddress address = InetAddress.getByName("localhost");
			int part = 8800;
			byte[] data = "�û���:admin;����:123".getBytes();
			// 2. �������ݱ�,�������͵�������Ϣ
			DatagramPacket packet = new DatagramPacket(data, data.length, address, part);
			// 3. ����DatagramSocket ����
			DatagramSocket socket = new DatagramSocket();
			// 4.��������˷������ݱ�
			socket.send(packet);

			/**
			 * ���ܷ������Ӧ������
			 */
			// 1.�������ݱ������ڽ��ܷ�������Ӧ������
			byte[] data2 = new byte[1024];
			DatagramPacket packet2 = new DatagramPacket(data2, data2.length);
			// 2. ���ܷ������Ӧ������
			socket.receive(packet2);
			// 3.��ȡ����
			String reply = new String(data2, 0, packet2.getLength());
			System.out.println("���ǿͻ���,�����˵:" + reply);
			// 4.�ر���Դ
			socket.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
