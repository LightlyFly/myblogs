package com.imooc;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * �������ˣ�ʵ�ֻ���UDP���û���¼
 * 
 * @author ���ĺ�
 *
 */
public class UDPServer {
	public static void main(String[] args) {
             /**
              *  ���ܿͻ��˷��͵�����
              */
		 
		try {
			// 1. ���������DatagramSocket,ָ���˿ں�
			DatagramSocket socket = new DatagramSocket(8800);
			// 2. �������ݱ�,���ڽ��ܿͻ��˷��͵�����
			byte[] data = new byte[1024]; // �����ֽ�����,ָ���������ݰ��Ĵ�С
			DatagramPacket packet = new DatagramPacket(data, data.length);
			// 3. ���ܿͻ��˷��͵�����
			System.out.println("***���������Ѿ�����,�ȴ��ͻ���**");
			socket.receive(packet); // �˷����ڽ������ݱ�֮ǰ��һֱ����
			// 4. ��ȡ����
			String info = new String(data, 0, packet.getLength());
			System.out.println("���Ƿ�����,�ͻ���˵:" + info);

			/**
			 *  ��ͻ�����Ӧ����
			 */
			// 1.����ͻ��˵ĵ�ַ,�˿ں�,����
			InetAddress address = packet.getAddress();
			int part = packet.getPort();
			byte [] data2 = "��ӭ��!".getBytes();
			// 2. �������ݱ�,������Ӧ��������Ϣ
			DatagramPacket packet2 = new DatagramPacket(data2,data2.length,address,part);
			// 3. ��Ӧ�ͻ���
			socket.send(packet2);
			
			// 4.�ر���Դ
			 socket.close();
			 
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
