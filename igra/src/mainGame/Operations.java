package mainGame;

import GlobalObjects.Globals;

import javax.swing.*;
import java.awt.*;


public class Operations extends JPanel {
    JButton[] OperationsB;
    public Operations() {
        this.OperationsB= new JButton[Globals.Moves];
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        setColor();
        CreateButtons();
    }

    public void setColor() {
        this.setBackground(Color.decode("#e0c1ec"));//color with hex code
        this.setForeground(Color.decode("#801EA6"));
    }

    public void CreateButtons() {
            for (int i = 0; i < Globals.Moves; i++) {//creates an array of random opperations
                int k = Globals.rand.nextInt(4);
                OperationsB[i]=new JButton("" + Globals.OperationsArr[k]);
                OperationsB[i].setBackground(Color.decode("#e0c1ec"));
                OperationsB[i].setForeground(Color.decode("#801EA6"));
                Globals.OperationsB[i]=OperationsB[i];
        }
    }
}

