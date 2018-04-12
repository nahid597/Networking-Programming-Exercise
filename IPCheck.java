package network;

import java.util.Scanner;

public class IPCheck {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			String str = scan.next();
			int i, ip = 0, ip1, ip2, ip3;
			ip1 = ip2 = ip3 = 0;
			for( i = 0; i < str.length(); i++)
			{
				if(str.charAt(i) == '.')
					break;
				ip  = ip * 10 + str.charAt(i)-'0';
			}
			
			for(i++; i < str.length(); i++)
			{
				if(str.charAt(i) == '.')
					break;
				ip1  = ip1 * 10 + str.charAt(i)-'0';
			}
			
			for(i++; i < str.length(); i++)
			{
				if(str.charAt(i) == '.')
					break;
				ip2  = ip2 * 10 + str.charAt(i)-'0';
			}
			
			for(i++; i < str.length(); i++)
			{
				if(str.charAt(i) == '.')
					break;
				ip3  = ip3 * 10 + str.charAt(i)-'0';
			}
			String ipBin = Integer.toBinaryString(ip);
			for( i = 0; i < 8-ipBin.length();i++)
				ipBin = "0" + ipBin;
			if(ip > 255 || ip1 > 255 || ip3 > 255 || ip2 > 255)
				System.out.println("Envalid IP");
			else if(ipBin.charAt(0) == '0')
				System.out.print(str + " is a class A IP");
			else if(ipBin.substring(0,2).equals("10"))
				System.out.print(str + " is a class B IP");
			else if(ipBin.substring(0,3).equals("110"))
				System.out.print(str + " is a class C IP");
			else if(ipBin.substring(0,4).equals("1110"))
				System.out.print(str + " is a class D IP");
			else if(ipBin.substring(0,4).equals("1111"))
				System.out.print(str + " is a class E IP");
			else;
			
		}
	}
}
