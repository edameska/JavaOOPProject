package Settings;

import GlobalObjects.Globals;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import static GlobalObjects.Globals.TargetField;

public class TargetPanel extends JPanel {
    public TargetPanel() {
        setBackground(Color.decode("#a0699d"));
        setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
        setBorder(new EmptyBorder(30,100,30,100));
        Target();
    }
    public void Target(){
        JLabel label=new JLabel("Target: ");
        label.setForeground(Color.decode("#e0c1ec"));
        add(label);
        JTextField t=new TextField(""+Globals.TargetVal);
        add(t);
        t.addActionListener(e -> {//gets target value from user
            Globals.TargetVal=Integer.parseInt(t.getText());
            Globals.TargetB.setText(""+Globals.TargetVal);
            TargetField=t;
        });

    }
}
