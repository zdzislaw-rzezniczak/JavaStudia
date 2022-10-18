package timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.*;

public class TimerTest {

    public static void main(String[] args) {
	var listener = new TimePrinter();
	var timer = new Timer(1000, listener);
    timer.start();

    JOptionPane.showMessageDialog(null, "Zamknąć program");
    System.exit(0);
    }
}

class TimePrinter implements ActionListener{
    public void actionPerformed(ActionEvent event){
        System.out.println("Kiedy usłyszysz dźwięk bezie godzina " + Instant.ofEpochMilli(event.getWhen()));
        Toolkit.getDefaultToolkit().beep();
    }
}
