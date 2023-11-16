package mainGame.MainGamePanels;

import GlobalObjects.Globals;

import javax.swing.*;
import java.awt.*;

public class LowerPanel extends JPanel {
    public LowerPanel() {
        setBackground(Color.decode("#a0699d"));
        Add();
    }
    public void Add() {
        add(Globals.SumB, BorderLayout.CENTER);
    }
}
