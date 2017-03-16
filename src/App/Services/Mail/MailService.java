/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Services.Mail;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import javax.mail.*;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Ilias Naamane
 */
public class MailService {

    /**
     * @param subject
     * @param text
     * @param destinataire
     */
    /**
     * 
     * @param name
     * @param Job
     * @return 
     */
    
    public static String BodyMessage(String name,String Job) {
        String BodyMessage = "Madame/Mademoiselle/Monsieur "+name+",\n\n" +
            "Votre candidature au poste "+Job+" au sein de notre société a retenu toute notre attention \n" +
            "et nous souhaiterions vous rencontrer. Nous vous proposons un entretien avec M. Dupont,\n" +
            "le "+new SimpleDateFormat("d MMM YYYY 'à' h:mm a").format(new Date().getTime()+604800000)  +
            " dans nos locaux situés à Hay Ryad, Mahaj Ryad imm.6, 10100 - Rabat.\n" +
            "Nous vous prions de bien vouloir nous confirmer votre présence à ce rendez-vous par email/par "+
            "teléphone au +212 5372-64382.\n\nDans l’attente de vous rencontrer,\nCordialement."    ;    
        return BodyMessage ;
    }
    
    public static void sendMail(String subject, String text, String destinataire) throws MessagingException {
        Properties properties = new Properties();
        properties.setProperty("mail.transport.protocol", "smtp");
        properties.setProperty("mail.smtp.host", "smtp.gmail.com");
        properties.setProperty("mail.smtp.starttls.enable", "true");
        properties.setProperty("mail.from", "UtilisateurJava@gmail.com");
        properties.setProperty("mail.smtp.port", "587");

        Session session = Session.getInstance(properties);
        MimeMessage message = new MimeMessage(session);
        message.setText(text);
        message.setSubject(subject);
            //message.addRecipients(Message.RecipientType.TO, destinataire);
            //message.addRecipients(Message.RecipientType.CC, copyDest);
  
        Transport transport = null;
        transport = session.getTransport("smtp");
        transport.connect("UtilisateurJava@gmail.com", "JavaProject");
        transport.sendMessage(message, new Address[]{new InternetAddress("mhhidorgr@gmail.com")});
        if (transport != null) {
            transport.close();
        }
    }
}
