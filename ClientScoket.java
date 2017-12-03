package ru.ac.bd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.*;

public class ClientScoket {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		
		
		String str = "nahid hasan";
		
		Socket s = new Socket("localhost",9999);
		
		OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream()); 
		
		PrintWriter out = new PrintWriter(os);
		
		out.write(str);
		
		out.flush();
		
		
		
		
		
		
		
		
		
		
			
		
		
	
	}

}
