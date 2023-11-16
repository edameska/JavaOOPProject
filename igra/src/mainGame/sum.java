package mainGame;

import javax.swing.*;
import java.awt.*;

public class sum extends JButton {

    public sum(String text) {
        super(text);//sends text to the super constructor
            setColor();
    }
    public void setColor (){
        setBackground(Color.decode("#e0c1ec"));
        setForeground(Color.decode("#801EA6"));
    }
}
