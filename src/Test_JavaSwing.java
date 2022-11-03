import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.tools.Tool;

public class Test_JavaSwing {
    static JFrame frame = createFrame();
    static JPanel panel = new JPanel();
    static JPanel panelSouth = new JPanel();
    public static void main(String[] args) {
        frame.add(panel);
        frame.add(panelSouth, BorderLayout.SOUTH);
        /*JButton button1 = new JButton(new myAction());
        button1.setText("button1");*/
        //WindowAdapter / WindowListener - обработка действий с окном

        JTextField textField = new JTextField("Это База!", 15);
        panel.add(textField, BorderLayout.SOUTH);

        JLabel label = new JLabel("Why I can't...");
        panel.add(label, BorderLayout.CENTER);

        JTextArea textArea = new JTextArea(5, 20);
        textArea.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(textArea);
        panel.add(scrollPane, BorderLayout.EAST);

        JButton button1 = new JButton("Button1");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.CYAN);
                textField.setText("Базу знать нужно!");
            }
        });
        panelSouth.add(button1);
        panel.revalidate();
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
