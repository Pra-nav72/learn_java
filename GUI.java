import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import javax.swing.*;
import java.awt.*;

public class GUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("My App");
        f.setBounds(10,0,300,300);

        Container c = f.getContentPane();

        JButton b = new JButton("Log in");
        JCheckBox ch = new JCheckBox("checking it", true);
        JTextField t = new JTextField(20);

        b.setBounds(20, 10, 90, 20);
        ch.setBounds(20,35,130,15);

        c.add(b);
        c.add(ch);
        c.add(t);

        f.setLayout(null);
        f.setVisible(true);
    }
}
