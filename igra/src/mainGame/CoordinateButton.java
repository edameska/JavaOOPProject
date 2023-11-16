package mainGame;

import GlobalObjects.Globals;

import javax.swing.*;


public class CoordinateButton extends JButton
        {
    int x;
    int y;
    ButtonsMatrix game;

    public CoordinateButton(String text,int x, int y, ButtonsMatrix game) {
        super(text);
        this.x = x;
        this.y = y;
        this.game=game;
        addActionListener(e -> {//when a button is clicked it updates tha game
            game.Change(this);
            Globals.Moves--;
            Globals.MovesB.setText(""+Globals.Moves);
            Globals.frame.revalidate();
            Globals.frame.repaint();
        });
    }

}
