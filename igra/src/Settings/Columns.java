package Settings;

import GlobalObjects.Globals;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
public class Columns extends JPanel {
    static TextField t;

    public Columns() {
        t=new TextField(""+Globals.n);
        CreateColumns();
    }
    public void CreateColumns() {
        setBackground(Color.decode("#a0699d"));
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        setBorder(new EmptyBorder(30, 100, 30, 100));
        JLabel label = new JLabel("Columns: ");
        label.setForeground(Color.decode("#e0c1ec"));
        t.addActionListener(e -> {//adds action listener to textfield but since the game is created before it, it just messes up the game
            Globals.n = Integer.parseInt(t.getText());
            System.out.println(Integer.parseInt(t.getText()));
        });
        add(label);
        add(t);
    }
}
