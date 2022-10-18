package Lab10;

import java.util.Properties;
import java.util.Scanner;
import javax.mail.*;
import javax.mail.internet.*;

public class Poczta {

    static Scanner sc = new Scanner(System.in);


    public static void wyslij(String od, String to, String tytul, String wiadomosc, String haslo){


        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(od,haslo);
                    }
                });
        try {
            MimeMessage message = new MimeMessage(session);
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
            message.setSubject(tytul);
            message.setText(wiadomosc);
            Transport.send(message);
            System.out.println("Wiadomość wyslana");
        } catch (MessagingException e) {throw new RuntimeException(e);}

    }

    public static String pobierzHaslo (){
        System.out.print("Podaj haslo do konta: ");
        return sc.next();

    }

    public static String generujWiadomosc (){
        System.out.println("Wpisz swoją wiadomość: ");
        return sc.next();
    }

    public static String generujTemat(){
        System.out.println("Wpisz tytuł wiadomości: ");
        return sc.next();

    } public static String generujAdres(){
        System.out.println("Podaj adres docelowy: ");
        return sc.nextLine();
    }
}
