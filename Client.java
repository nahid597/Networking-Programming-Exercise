package ru.ac.bd;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	Socket s;
	DataInputStream din;
	
	DataOutputStream out;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Client();

	}
	
	
	
	public Client()
	{
		
		try {
			s = new Socket("localhost",9950);
			
			din = new DataInputStream(s.getInputStream());
			
			out = new DataOutputStream(s.getOutputStream());
			
			listenForInput();
			
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}



	private void listenForInput() {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		while(true)
		{
			
			while(!in.hasNextLine()){
				
				try {
					Thread.sleep(1000);
					
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
			String input = in.nextLine();
			
			if(input.toLowerCase().equals("quit")){
				
				break;
			}
			
			try {
				out.writeUTF(input);
				
				while(din.available() == 0)
				{
					try {
						Thread.sleep(1000);
						
						
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
				String reply = din.readUTF();
				
				System.out.println(reply);
				
				
				
			} catch (IOException e) {
				
				e.printStackTrace();
				break;
			}
			
			
		}
		
		
		try {
			din.close();
			out.close();
			s.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	} 

	
	
}
