package ui;

import javax.swing.*;
import java.awt.*;

public class Modal extends JDialog {

    public Modal( JFrame parent, String title, String message ) {
        super(parent, title, true);

        // Panel - content
        // Label - message
        JPanel panel = new JPanel();
        JLabel label = new JLabel(message);

        // 2. Add JLabel to JPanel
        panel.add(label);
        getContentPane().add(panel);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void render(JFrame parent, String title, String message) {
        new Modal(parent, title, message);
    }

}
