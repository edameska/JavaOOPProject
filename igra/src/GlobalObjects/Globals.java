package GlobalObjects;
import Menu.MyMenu;
import Settings.Difficulty;
import Settings.MySettings;
import Settings.TextField;
import mainGame.MainGamePanels.RightPanel;
import mainGame.Target;
import mainGame.Moves;
import mainGame.MainGamePanels.MyGame;

import javax.swing.*;
import java.util.Random;

public class Globals {

    //main game variables
    public static int Summary=0;
    public static Random rand = new Random();
    public static int TargetVal=Summary+ rand.nextInt(50);
    public static int Moves =55;
    public static int m=5;
    public static int n=5;
    public static char[] OperationsArr ={'+','/','*','-'};

    public static JButton SumB=new mainGame.sum(""+ Summary);
    public static JButton TargetB=new Target(""+TargetVal);
    public static JButton MovesB =new Moves(""+ Moves);
    public static JButton ExitB =new mainGame.Exit();
    public static JButton [][] Buttons=new JButton[m][n];

    public static JButton[] OperationsB =new JButton[Moves];
    public static JPanel RightPanel= new RightPanel();

    //menu variables
    public static JButton Load=new Menu.Load();
    public static JButton NewGame= new Menu.NewGame();


    // things for main
   public static JFrame frame= new JFrame("More or less, less is more");
    public static JPanel Game= new MyGame();
    public static JPanel Menu= new MyMenu();
    //settings variables
    public static JComboBox Difficulty= new Difficulty();
    public static JPanel Settings= new MySettings();
    //these 2 dont work
   public static JTextField TargetField=new TextField("89");
   public static JTextField MovesField=new TextField("69");



}
