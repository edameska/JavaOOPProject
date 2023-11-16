package mainGame;

import javax.swing.*;
import java.awt.*;

public class Target extends JButton {
    public Target(String text) {
        super(text);
        setColor();
    }
    public void setColor (){
        setBackground(Color.decode("#e0c1ec"));
        setForeground(Color.decode("#801EA6"));
    }
}
