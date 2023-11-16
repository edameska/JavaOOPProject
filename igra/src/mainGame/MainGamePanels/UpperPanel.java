package mainGame.MainGamePanels;

import GlobalObjects.Globals;

import javax.swing.*;
import java.awt.*;

public class UpperPanel extends JPanel {
    public UpperPanel() {
        setBackground(Color.decode("#a0699d"));
        Add();
    }
    public void Add(){
        setLayout(new BorderLayout());
        add(Globals.TargetB,BorderLayout.CENTER);
        add(Globals.ExitB, BorderLayout.WEST);
    }
}
