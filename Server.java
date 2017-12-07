package ru.ac.bd;

import java.io.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
	
	ServerSocket ss;
	
	ArrayList < MultiServer > connection = new ArrayList < MultiServer >();
	
	boolean shouldRun = true;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Server();

	}
	
	public Server()
	{
		try {
			
			
			
			while(shouldRun)
			{
				System.out.println("SErver started");
				
				ss = new ServerSocket(9950);
				
				System.out.println("SErver wating for client");
				
				Socket s = ss.accept();
				
				MultiServer sc = new MultiServer(s,this);
				
				sc.start();
				
				connection.add(sc); 
				 				
			}
					
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

		
	}
	
	
