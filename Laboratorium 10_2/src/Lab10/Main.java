package Lab10;
import java.io.*;
import java.net.*;
import java.util.concurrent.TimeUnit;

public class Main {
        public static void main(String[] args){
            try{
                ServerSocket ss=new ServerSocket(6666);
                Socket s=ss.accept();//establishes connection
                DataInputStream dis=new DataInputStream(s.getInputStream());
                DataOutputStream dout=new DataOutputStream(s.getOutputStream());

                dout.writeUTF("Wysłano komunikat do klienta");

                if (dis.readUTF().equals("Nawiązano komunikację i wysłano odpowiedź")){
                    CountDown.odliczanie();
                    dout.writeUTF("Połączenie zatwierdzone");
                }else{
                    ss.close();
                }

                ss.close();
            }catch(Exception e){System.out.println(e);}
        }
    }
