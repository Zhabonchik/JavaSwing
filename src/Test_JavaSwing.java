import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.tools.Tool;

public class Test_JavaSwing {
    public static void main(String[] args) {
        JFrame frame = createFrame();
        JPanel panel = new JPanel();
        frame.add(panel,  BorderLayout.CENTER);
        JButton button1 = new JButton("Button1");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.CYAN);
            }
        });
        panel.add(button1);
        frame.pack();
    }

    static JFrame createFrame() {
        JFrame frame =  new JFrame(){};
        frame.setVisible(true);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        frame.setBounds(dimension.width / 2 - 400, dimension.height / 2 - 300, 800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }
}
