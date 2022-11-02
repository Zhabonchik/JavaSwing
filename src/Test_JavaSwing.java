import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Test_JavaSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton btn = new JButton("button");
        JButton btn1 = new JButton("button1");
        JPanel panel = new JPanel();
        panel.add(btn);
        panel.add(btn1);
        frame.setContentPane(panel);
        frame.setBounds(150, 150, 400, 350);
        frame.pack();
        frame.setVisible(true);
    }
}
