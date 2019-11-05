package Lesson_1104;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TimePrinter implements ActionListener {

    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(10000,listener);
        t.start();
        JOptionPane.showMessageDialog(null,"Quite?");
        System.exit(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Date now = new Date();
        System.out.println("At the tone ,the time is "+now);
        Toolkit.getDefaultToolkit().beep();
    }
}
