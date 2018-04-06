package ru.ac.bd;

import java.util.*;
import java.net.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.mail.Session;
import javax.mail.Transport;

public class MailSend {
	 
	   public static void main(String [] args) 
	   {    
	      String recipient = "nahidhasan1943@gmail.com";
	 
	      String sender = "nahidh597@gmail.com";
	 
	      String host = "127.0.0.1";
	 
	      Properties properties = System.getProperties();
	      properties.setProperty("mail.smtp.host", host);
	      properties.put("mail.smtp.port","9999");
	      Session session = Session.getDefaultInstance(properties);
	 
	      try
	      {
	         MimeMessage message = new MimeMessage(session);
	 
	         message.setFrom(new InternetAddress(sender));
	 
	         message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
	 
	         message.setSubject("This is Suject");
	 
	         message.setText("This is a test mail");
	 
	         Transport.send(message);
	         System.out.println("Mail successfully sent");
	      }
	      catch (MessagingException e) 
	      {
	         e.printStackTrace();
	      }
	   }
	}
	
