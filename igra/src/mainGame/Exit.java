package mainGame;

import GlobalObjects.Globals;
import mainGame.MainGamePanels.MyGame;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Exit extends JButton {
    public Exit() {
        super("Exit & Save");
        setColor();
        addActionListener(e -> {
            JFileChooser chooser = new JFileChooser();//chooses a file
            FileNameExtensionFilter filter = new FileNameExtensionFilter("text", ".txt");//adds extension to the file
            chooser.setFileFilter(filter);
            int UserOption = chooser.showSaveDialog(null);//save dialog box that allows the user to specify a file name 

            if (UserOption == JFileChooser.APPROVE_OPTION) {//print location where its saved and get its absolute path
                System.out.print("Saved in: ");
                File file = chooser.getSelectedFile();
                //print saved path
                System.out.println(file.getAbsolutePath());
                //because it deals with memory
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file));//writer writes text to a file
                    //write position of buttons
                    for (int i = 0; i < Globals.Buttons.length; i++) {
                        for (int j = 0; j < Globals.Buttons[i].length; j++) {
                                writer.write(Globals.Buttons[i][j].getText()+" ");//writes buttons
                        }
                        writer.write("\n");
                    }
                    writer.write(" "+Globals.TargetVal);//writes target
                    writer.close();
                    System.exit(0);//exits the game
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
    public void setColor (){
        setBackground(Color.decode("#e0c1ec"));//color with hex code
        setForeground(Color.decode("#801EA6"));
    }
}
