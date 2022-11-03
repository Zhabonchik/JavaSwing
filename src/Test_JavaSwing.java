import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.tools.Tool;

public class Test_JavaSwing {
    static JFrame frame = createFrame();
    static JPanel panel = new JPanel();
    public static void main(String[] args) {
        frame.add(panel,  BorderLayout.CENTER);
        /*JButton button1 = new JButton(new myAction());
        button1.setText("button1");*/
        //WindowAdapter / WindowListener - обработка действий с окном

        JButton button1 = new JButton("Button1");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.CYAN);
            }
        });
        panel.add(button1);
        //frame.pack();
    }

    /*static class myAction extends AbstractAction {
        myAction() {
            putValue(AbstractAction.SHORT_DESCRIPTION, "Description");
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            panel.setBackground(Color.black);
        }
    }*/

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
