package mainGame.MainGamePanels;

import GlobalObjects.Globals;
import mainGame.Operations;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;


public class RightPanel extends JPanel {
    public RightPanel() {
        setBackground(Color.decode("#a0699d"));
        Add();
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        setBorder(new EmptyBorder(0,10,0,10));

    }

    public void Add(){
        add(Globals.MovesB);
        add(new Operations());
    }
}
