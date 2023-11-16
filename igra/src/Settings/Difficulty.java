package Settings;

import GlobalObjects.Globals;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


import static GlobalObjects.Globals.rand;

public class Difficulty extends JComboBox {

    public Difficulty() {
        super();
        AddEl();
        //clicked on item
        addItemListener(e -> {//sets difficulty, doesnt set it to the textfield in settings but changes the actual moves and target in game
            String choice= String.valueOf(Globals.Difficulty.getSelectedItem());
            switch (choice){
                case "Easy":
                    Globals.Moves=75;
                    Globals.MovesB.setText(""+Globals.Moves);
                    Globals.TargetVal=Globals.Summary+rand.nextInt(50);
                    Globals.TargetB.setText(""+Globals.TargetVal);
                    break;
                case "Average":
                    Globals.Moves=50;
                    Globals.MovesB.setText(""+Globals.Moves);
                    Globals.TargetVal=Globals.Summary+rand.nextInt(75);
                    Globals.TargetB.setText(""+Globals.TargetVal);
                    break;
                case "Difficult":
                    Globals.Moves=40;
                    Globals.MovesB.setText(""+Globals.Moves);
                    Globals.TargetVal=Globals.Summary+rand.nextInt(100);
                    Globals.TargetB.setText(""+Globals.TargetVal);
                    break;
                default:
                    break;
            }
        });
    }
    public void AddEl(){
        String[] Options={"Custom","Easy","Average","Difficult"};
        for (String option : Options) {
            addItem(option);
            setForeground(Color.decode("#a0699d"));

        }

    }
}
