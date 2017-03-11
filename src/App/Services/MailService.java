/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Services;

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
    public static String sendMail(String subject, String text, String destinataire) {
        Properties properties = new Properties();
        properties.setProperty("mail.transport.protocol", "smtp");
        properties.setProperty("mail.smtp.host", "smtp.gmail.com");
        properties.setProperty("mail.smtp.starttls.enable", "true");
        properties.setProperty("mail.from", "UtilisateurJava@gmail.com");
        properties.setProperty("mail.smtp.port", "587");

        Session session = Session.getInstance(properties);
        MimeMessage message = new MimeMessage(session);
        try {
            message.setText(text);
            message.setSubject(subject);
            //message.addRecipients(Message.RecipientType.TO, destinataire);
            //message.addRecipients(Message.RecipientType.CC, copyDest);
        } catch (MessagingException e) {
            return "Impossible de crée le message" ;
        }
        Transport transport = null;
        try {
            transport = session.getTransport("smtp");
            transport.connect("UtilisateurJava@gmail.com", "JavaProject");
            transport.sendMessage(message, new Address[]{new InternetAddress(destinataire)});
        } catch (MessagingException e) {
            return "Verifier la connexion internet" ;
        } finally {
            try {
                if (transport != null) {
                    transport.close();
                }
            } catch (MessagingException e) {
                return "Impossible de fermer la connexion" ;
            }
            return "Message envoyé" ;
        }
    }
}
