package ru.ac.bd;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class MultiServer extends Thread{
	
	Socket socket;
	Server server;
	
	DataInputStream din;
	DataOutputStream out;
	
	boolean shouldRun = true;
	

	public MultiServer(Socket socket, Server server)
	{
		
		super("MultiServer Connection");
		
		this.socket = socket;
		this.server = server;
				
	}
	
	public void sendToClient(String text)
	{
		
		try {
			out.writeUTF(text);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void sendToAllClient(String text)
	{
		
		for(int i = 0; i < server.connection.size(); i++)
		{
			MultiServer sc = server.connection.get(i);
			
			sc.sendToClient(text);
			
		}
		
	}
	
	
	public void Run()
	{
		
		try {
			din = new DataInputStream(socket.getInputStream());
			
			out = new DataOutputStream(socket.getOutputStream());
			
			
			while(shouldRun)
			{
				
				while(din.available() == 0)
				{
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
						
				}
				
				String textIn = din.readUTF();
				
				sendToAllClient(textIn);
				
				
			}
			din.close();
			out.close();
			socket.close();
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}
	
}
