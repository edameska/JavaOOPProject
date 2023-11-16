package Settings;

import GlobalObjects.Globals;

import javax.swing.*;
import java.awt.*;

public class MySettings extends JPanel {
    public MySettings() {
        CreateSettings();
    }
    public void CreateSettings(){
        setBackground(Color.decode("#a0699d"));
        //doesnt work entirely because
        // the game is created before the user has the opportunity to insert the numbers for columns and rows
        //and it only messes with the gameplay
        //only the difficulties work
        add(new Rows());
        add(new Columns());
        add(new DifficultyPanel());
        add(new TargetPanel());
        add(new MovesPanel());
        add(new Start());
    }

}
