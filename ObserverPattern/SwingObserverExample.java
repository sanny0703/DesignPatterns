import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    private JFrame frame;
    private JButton button;
    public SwingObserverExample() {
        frame = new JFrame();
        button = new JButton("Press me!!");
    }

    public static void main(String[] args) {
        SwingObserverExample sw = new SwingObserverExample();
        sw.go();
    }

    private void go() {
        frame.add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
        // we are adding observers here
        button.addActionListener(new DevilActionListener());
        button.addActionListener(new GodActionListener());
    }

    private void setText(String text) {
        button.setText(text);
    }

    private class DevilActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("No, Don't press me!!");
        }
    }

    private class GodActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Please, press me!!");
        }
    }
}
