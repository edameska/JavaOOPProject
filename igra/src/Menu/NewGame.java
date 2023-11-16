package Menu;

import GlobalObjects.Globals;
import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewGame extends JButton  {
    public NewGame() {//should open settings
        super("New Game" );
        setBackground(Color.decode("#e0c1ec"));//color with hex code
        setForeground(Color.decode("#801EA6"));
        addActionListener(e -> {//removes menu and loads setings
        Globals.frame.remove(Globals.Menu);
        Globals.frame.revalidate();

        Globals.frame.add(Globals.Settings);
        Globals.frame.revalidate();
        Globals.frame.repaint();

        });
    }
}
