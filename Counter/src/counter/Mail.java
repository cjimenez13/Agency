package counter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YorleydeMaría
 */

import java.util.Properties; 
import javax.mail.*; 
import javax.mail.internet.*; 
  
public class Mail { 
      
    String destinatary; 
    String asunto="Notificación de su casillero"; 
    String mensaje; 
    private final String Sender="yorleymaria@yahoo.com";
    private final String Password="pajarito1";
    private final String host = "smtp.mail.yahoo.com";
      
      
    // Constructor Correo 
    public Mail (String pDestinatario,String pMensaje) { 
        destinatary = pDestinatario; 
        mensaje = pMensaje;
          
    } 
      
    public void enviarCorreo () {  
          // Get system properties
          Properties properties = System.getProperties();
          // Setup mail server
          properties.put("mail.smtp.starttls.enable", "true");
          properties.put("mail.smtp.host", host);
          properties.put("mail.smtp.user", Sender);
          properties.put("mail.smtp.password", Password);
          properties.put("mail.smtp.port", "587");
          properties.put("mail.smtp.auth", "true");

          // Get the default Session object.
          Session session = Session.getDefaultInstance(properties);

          try{
             // Create a default MimeMessage object.
             MimeMessage message = new MimeMessage(session);

             // Set From: header field of the header.
             message.setFrom(new InternetAddress(Sender));

             // Set To: header field of the header.
             message.addRecipient(Message.RecipientType.TO,new InternetAddress(destinatary));

             // Set Subject: header field
             message.setSubject(asunto);

             // Now set the actual message
             message.setText(mensaje);

             // Send message
             Transport transport = session.getTransport("smtp");
             transport.connect(host, Sender, Password);
             transport.sendMessage(message, message.getAllRecipients());
             transport.close();
             System.out.println("Sent message successfully....");
          }catch (MessagingException mex) {
             mex.printStackTrace();
          }
    }
}