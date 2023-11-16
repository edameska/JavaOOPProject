import GlobalObjects.Globals;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {



        Globals.frame.setLocation(100,100);
        Globals.frame.setSize(600,600);
        Globals.frame.setBackground(Color.decode("#a0699d"));
        //adding menu
       Globals.frame.add(Globals.Menu);


        Globals.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Globals.frame.setVisible(true);
    }
}