package mainGame;

import javax.swing.*;
import java.awt.*;

public class Moves extends JButton {
    public Moves(String text) {
        super(text);
        setColor();
    }
    public void setColor (){
        setBackground(Color.decode("#e0c1ec"));//color with hex code
        setForeground(Color.decode("#801EA6"));
    }
}
