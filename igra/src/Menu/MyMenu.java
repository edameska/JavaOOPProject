package Menu;

import GlobalObjects.Globals;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class MyMenu extends JPanel {
    public MyMenu() {
        Draw();
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        setBorder(new EmptyBorder(0,10,0,10));
    }
    public void Draw(){
        setBackground(Color.decode("#a0699d"));
        JPanel LoadPanel =new JPanel();
        LoadPanel.add(Globals.Load,BorderLayout.CENTER);
        LoadPanel.setBorder(new EmptyBorder(100,100,80,100));
        LoadPanel.setBackground(Color.decode("#a0699d"));
        add(LoadPanel);
        JPanel NewPanel = new JPanel();
        NewPanel.add(Globals.NewGame,BorderLayout.CENTER);
        NewPanel.setBorder(new EmptyBorder(20,80,100,100));
        NewPanel.setBackground(Color.decode("#a0699d"));
        add(NewPanel);

    }
}
