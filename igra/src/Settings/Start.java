package Settings;

import GlobalObjects.Globals;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Start extends JButton {
    public Start() {
        super("Start");
        setBackground(Color.decode("#e0c1ec"));
        setForeground(Color.decode("#a0699d"));
        addActionListener(e -> {//removes settings and adds game
            Globals.frame.remove(Globals.Settings);
            Globals.frame.revalidate();

            Globals.frame.add(Globals.Game);
            Globals.frame.revalidate();
            Globals.frame.repaint();
        });
    }
}
