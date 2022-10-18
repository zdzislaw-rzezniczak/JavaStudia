package Lab10;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
        try{
            Socket s=new Socket("localhost",6666);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            DataInputStream dis=new DataInputStream(s.getInputStream());

            if (dis.readUTF().equals("Wysłano komunikat do klienta"))
                    dout.writeUTF("Nawiązano komunikację i wysłano odpowiedź");

            CountDown.odliczanie();


            dout.flush();
            dout.close();
            s.close();
        }catch(Exception e){System.out.println(e);}
    }
}
