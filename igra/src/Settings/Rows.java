package Settings;

import GlobalObjects.Globals;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rows extends JPanel {
    static TextField t;
    public Rows() {
       t=new TextField(""+Globals.m);
        CreateRows();
    }
    public void CreateRows() {
        setBackground(Color.decode("#a0699d"));
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        setBorder(new EmptyBorder(30, 100, 30, 100));
        JLabel label=new JLabel("Rows: ");
        label.setForeground(Color.decode("#e0c1ec"));
        add(label);
        add(t);
        t.addActionListener(e -> {//should change rows but messes up the game
            Globals.m=Integer.parseInt(t.getText());
            System.out.println(Integer.parseInt(t.getText()));
        });
    }
}
