package ru.ac.bd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SerSocket {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("s : Server is started");
		
		ServerSocket ss = new ServerSocket(9999);
		
		System.out.println("s : Server is waiting for client request");
		
		Socket s = ss.accept();
		
		System.out.println(" s :Client connected");
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String str = br.readLine();
		
		System.out.println("s :Client data: " + str);
		
	
			

	}

}
