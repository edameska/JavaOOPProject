package Settings;

import GlobalObjects.Globals;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovesPanel extends JPanel {
    public MovesPanel() {
        setBackground(Color.decode("#a0699d"));
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        setBorder(new EmptyBorder(30, 100, 30, 100));
        Moves();
    }

    void Moves() {
        JLabel label = new JLabel("Moves: ");
        label.setForeground(Color.decode("#e0c1ec"));
        add(label);
        JTextField t = new JTextField("" + Globals.Moves, 30);
        add(t);
        t.addActionListener(e -> {//changes Moves
            Globals.Moves = Integer.parseInt(t.getText());
            Globals.MovesField=t;
        });

    }
}
