package ru.ac.bd;

import java.net.*;
import java.io.*;

public class Aggignment1_URl_class_access2 {
    public static void main(String[] args) throws Exception {
        URL oracle = new URL("http://www.ru.ac.bd/");
        URLConnection yc = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                                    yc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close();
    }
}

	
	
	

