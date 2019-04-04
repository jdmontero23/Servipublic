package controlador;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class EnvioCorreo {

	
	public void envioEmail(String correoElec) throws MessagingException{
	
    try {
        Properties props = new Properties();
        props.setProperty("mail.smtp.host", "smtp.gmail.com");
        props.setProperty("mail.smtp.starttls.enable", "true");
        props.setProperty("mail.smtp.port", "587");
        props.setProperty("mail.smtp.auth", "true");


        Session session = Session.getDefaultInstance(props);

        String correoRemitente = "juand.monterob@ecci.edu.co";
        String passwordRemitente = "Valentina2316";
        String correoReceptor = correoElec;
        String asunto = "Actualizacion de Contacto";        
        String mensaje = "<HTML><BODY><PRE><FONT FACE='arial' SIZE='2'><BR>      Para asegurar la entrega de nuestros e-mail en su correo, por favor agregue</BR>"
  			  + "<BR>           juand.monterob@ecci.edu.co a su libreta de direcciones de correo.</BR>"
  			  + "<BR> </BR> "
  			  + "<BR> </BR> "
  			  + "<BR>Apreciado cliente,</BR>"
  			  + "<BR>  </BR> "
  			  + "<BR>De acuerdo con su solicitud, realizamos la correcta actualización de contacto el dia " + "27/03/2019(Variable)"  + " a las " + "18:25(Variable)"  +  ".</BR>"
  			  + "<BR>  </BR>" 
  			  + "<BR>  </BR>"
  			  + "<BR>  </BR>"	   
  			  + "<BR>  </BR>"
  			  + "<BR>  </BR>"
  			  + "</FONT></PRE></BODY></HTML>";
        

        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(correoRemitente));

        message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
        message.setSubject(asunto);
        //message.setText(mensaje, "ISO-8859-1", "html");
        message.setText(mensaje, "text/html");

        Transport t = session.getTransport("smtp");
        t.connect(correoRemitente, passwordRemitente);
        t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
        t.close();

        JOptionPane.showMessageDialog(null, "Correo Electronico Enviado");

    } catch (AddressException ex) {
    	
    	JOptionPane.showMessageDialog(null, "Correo Electronico No Enviado");
    } 
	}
}
