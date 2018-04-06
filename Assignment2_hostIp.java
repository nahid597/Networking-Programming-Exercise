package ru.ac.bd;

import java.net.InetAddress;
import java.net.UnknownHostException;
 

public class Assignment2_hostIp {

	
	    public static void main(String a[]){
	     
	        try {
	            InetAddress host = InetAddress.getByName("www.facebook.com");
	            System.out.println(host.getHostAddress());
	        } catch (UnknownHostException ex) {
	            ex.printStackTrace();
	        }
	    }
	}

