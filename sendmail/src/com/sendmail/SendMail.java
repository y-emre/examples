package com.sendmail;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class SendMail {
	
    private static final String USERNAME = "Sender Mail";
    private static final String PASSWORD = "Sender Password";
	private static final String HOST = "smtp.gmail.com";
	
	public static boolean sendMail(String receiverMail, String subject, String body) {
		Session session = Session.getInstance(setProperties());
		try {
        	MimeMessage message = setMessage(session, receiverMail, subject, body);
        	transportProcess(session, message);
            return true;
        }
        catch (MessagingException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }
	
	private static Properties setProperties(){
		Properties props = System.getProperties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", HOST);
        props.put("mail.smtp.user", USERNAME);
        props.put("mail.smtp.password", PASSWORD);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        return props;
	}
	
	private static MimeMessage setMessage(Session session, String receiverMail, String subject, String body) throws MessagingException{
        MimeMessage message = new MimeMessage(session);
		message.setFrom(new InternetAddress(USERNAME));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(receiverMail));
        message.setSubject(subject);
        message.setText(body);
        return message;
	}
	
	private static void transportProcess(Session session, MimeMessage message) throws MessagingException{
		Transport transport = session.getTransport("smtp");
        transport.connect(HOST, USERNAME, PASSWORD);
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
	}
	
}