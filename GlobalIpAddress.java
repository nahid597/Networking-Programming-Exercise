package ru.ac.bd;

import java.net.*;

public class GlobalIpAddress {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
		
		InetAddress address = InetAddress.getLocalHost();
		
		System.out.println("Local Host : " + address);
		
		InetAddress ip[] = InetAddress.getAllByName("www.du.bangla.net");
		
		
		System.out.println("Remote Host :");
		
		for(int i = 0; i < ip.length; i++)
		{
			
			System.out.println(ip[i]);
			
			
		}
		
		
		}
		
		catch ( Exception e)
		{
			
			System.out.println("Error");
			
		}
		
		
			

	}

}
