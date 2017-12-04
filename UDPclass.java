package ru.ac.bd;

import java.net.*;

public class UDPclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception
	
	{
		// TODO Auto-generated method stub
		
		
		InetAddress ipAddress;
		
		DatagramPacket dgPacket;
		
		DatagramSocket dgSocket;
		
		byte mgs[] = new byte [100];
		
		ipAddress = InetAddress.getByName("www.ru.ac.bd");
		
		dgPacket = new DatagramPacket(mgs, mgs.length,ipAddress,13);
		
		dgSocket = new DatagramSocket ();
		
		dgSocket.send(dgPacket);
		
		dgPacket = new DatagramPacket(mgs, mgs.length);
		
		dgSocket.receive(dgPacket);
		
		String str = new String (dgPacket.getData());
		
		System.out.println("Current data and time is: \n" + str);
		
		
		
		

	}

}
