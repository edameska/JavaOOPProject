package mainGame.MainGamePanels;
import GlobalObjects.Globals;
import mainGame.ButtonsMatrix;
import mainGame.Operations;

import javax.swing.*;
import java.awt.*;

public class MyGame extends JPanel {
    public MyGame() {
        Draw();
        setBackground(Color.decode("#a0699d"));
    }
    public void Draw(){
       setLayout(new BorderLayout());
       //setBackground(Color.pink);
       add(new LowerPanel(),BorderLayout.SOUTH);
       add(new UpperPanel(),BorderLayout.NORTH);
       add(Globals.RightPanel,BorderLayout.EAST);
       add(new ButtonsMatrix(this),BorderLayout.CENTER);
    }
}
