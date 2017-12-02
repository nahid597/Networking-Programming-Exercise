
package ru.ac.bd;

import java.net.*;

public class IpAddressFound {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try{
			
			if(args.length > 0)
			{
				
				String host = args[0];
				
				InetAddress[] address = InetAddress.getAllByName(host);
				
				System.out.println("remote host");
				
				for(int i = 0; i < address.length; i++)
				{
					
					System.out.println(address[i]);
					
				}
				
				
			}
			
			else
			{
				
				InetAddress localhost = InetAddress.getLocalHost();
				
				System.out.println("local host: " + localhost);
				
			}
			
			
			
		}
		
		catch(Exception e)
		{
			System.out.println("Error: " +e);
			
		}
			

	}

}
