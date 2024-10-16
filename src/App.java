import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        JFrame frame = new JFrame("HELLO WORLD");
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(500,500));
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

    }
}
