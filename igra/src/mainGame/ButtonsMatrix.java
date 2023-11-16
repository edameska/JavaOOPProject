package mainGame;

import GlobalObjects.Globals;
import mainGame.MainGamePanels.MyGame;

import javax.swing.*;
import java.awt.*;

import static GlobalObjects.Globals.OperationsB;


public class ButtonsMatrix extends JPanel{
    CoordinateButton[][] buttons;
    CoordinateButton A;
    CoordinateButton B;
    MyGame GamePanel;
    public ButtonsMatrix(MyGame GamePanel) {
        this.buttons = new CoordinateButton[Globals.m][Globals.n];
        this.GamePanel=GamePanel;
        CreateButtons();
    }

    public void CreateButtons() {
        setLayout(new GridLayout(Globals.m, Globals.n));
        for (int i = 0; i < Globals.m; i++) {
            for (int j = 0; j < Globals.n; j++) {
                buttons[i][j] = new CoordinateButton("" + Globals.rand.nextInt(10), i, j,this);

               buttons[i][j].setBackground(Color.decode("#e0c1ec"));//color with hex code
                buttons[i][j].setForeground(Color.decode("#801EA6"));
                add(buttons[i][j]);
                Globals.Summary += Integer.parseInt(buttons[i][j].getText());
                Globals.SumB.setText(""+Globals.Summary);
                Globals.Buttons[i][j]=buttons[i][j];
            }
        }

    }
    public void Change(CoordinateButton clicked){//clicked button updates
        if(A==null){
            A=clicked;
            Globals.RightPanel.add(OperationsB[Globals.Moves-1]);
        }
        else{//lose condition
            if(Globals.Moves==1){
                GamePanel.remove(this);
                JButton b=new JButton("YOU LOST");
                b.setBackground(Color.decode("#e0c1ec"));
                b.setForeground(Color.decode("#801EA6"));
                GamePanel.add(b);
            }
            B=clicked;
            int temp=Integer.parseInt(A.getText());
            switch (OperationsB[Globals.Moves].getText()){//changes operations
                case "+":
                    A.setText(""+(Integer.parseInt(A.getText())+Integer.parseInt(B.getText()))%10);
                    break;
                case "-":
                    A.setText(""+(Integer.parseInt(A.getText())-Integer.parseInt(B.getText()))%10);
                    break;
                case"*":
                    A.setText(""+(Integer.parseInt(A.getText())*Integer.parseInt(B.getText()))%10);
                    break;
                case "/":
                    A.setText(""+(Integer.parseInt(A.getText())/Integer.parseInt(B.getText()))%10);
                    break;
            }
            for (int i = Globals.Moves-1; i > Globals.Moves-Globals.m-1; i--) {//displaying operations
                Globals.RightPanel.add(OperationsB[i]);
                Globals.RightPanel.remove(OperationsB[Globals.Moves]);
                Globals.RightPanel.add(OperationsB[Globals.Moves-2]);
            }
         OperationsB[Globals.Moves-1].setBackground(Color.decode("#B3E2D4"));//should highlight current operation

            Globals.Summary+=(Integer.parseInt(A.getText())-temp);//changes sum
            Globals.SumB.setText(""+Globals.Summary);
            if(Globals.Summary==Globals.TargetVal){//win condition
                GamePanel.remove(this);
                JButton b=new JButton("YOU WON");
                b.setBackground(Color.decode("#e0c1ec"));
                b.setForeground(Color.decode("#801EA6"));
                GamePanel.add(b);
            }
            A=B;
            B=null;

        }
        for (int i = 0; i < Globals.m; i++) {
                for (int j = 0; j < Globals.n; j++) {
                    if(i== clicked.x|| j==clicked.y)
                    {
                        buttons[i][j].setBackground(Color.decode("#B3E2D4"));
                        buttons[i][j].setEnabled(true);
                    }//end if
                    else {
                        buttons[i][j].setEnabled(false);
                        buttons[i][j].setBackground(Color.decode("#e0c1ec"));
                    }
                }//end forj
        }//end fori
    }//end method
}



