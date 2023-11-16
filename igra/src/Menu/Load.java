package Menu;

import GlobalObjects.Globals;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Load extends JButton {
    public Load() {
        super("Load Game");
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();//chooses a file
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    String line;
                    try (BufferedReader br = new BufferedReader(new FileReader(selectedFile))) {// reads text using buffering
                        while ((line = br.readLine()) != null) {//reads file
                            String [] linearr=line.split("\n");//splits by new lines
                            String [] l=linearr[linearr.length-1].split(" ");//splits by spaces
                            Globals.TargetVal=Integer.parseInt(l[1]);//target value is saved as the first value
                            Globals.m=linearr.length-1;//gets row number
                            for (int i = 0; i < linearr.length-1; i++) {
                                String [] s= linearr[i].split(" ");
                                Globals.n=s.length;//gets column number
                                for (int j = 0; j <s.length; j++) {
                                    Globals.Buttons[i][j].setText(s[j]);
                                }
                            }
                            Globals.frame.remove(Globals.Menu);
                            Globals.frame.revalidate();

                            Globals.frame.add(Globals.Game);
                            Globals.frame.revalidate();
                            Globals.frame.repaint();
                        }
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    System.out.println("File selected: " + selectedFile.getAbsolutePath());//prints selected file and absolute path
                }
            }
        });
        setSize(200,200);
        setBackground(Color.decode("#e0c1ec"));
        setForeground(Color.decode("#801EA6"));
    }

}
