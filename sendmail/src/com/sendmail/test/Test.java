package com.sendmail.test;

import com.sendmail.SendMail;

public class Test {
				
	public static void main(String[] args) {
		
		String receiverMail = "Receiver Mail";
		String subject = "Message Title";
		String body = "Message Content";
		
		if(SendMail.sendMail(receiverMail, subject, body))
			System.out.println("Completed successfully");
		else
			System.err.println("ERROR");
	}
}
