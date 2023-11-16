package Settings;

import GlobalObjects.Globals;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class DifficultyPanel extends JPanel {
    public DifficultyPanel() {
        setBackground(Color.decode("#a0699d"));
        setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
        JLabel label=new JLabel("Select Difficulty");
        label.setForeground(Color.decode("#e0c1ec"));
        add(label);
        add(Globals.Difficulty);
        setBorder(new EmptyBorder(30,100,50,100));
    }
}
