package src.Game;

import src.Game.GameBoardPanel;

import javax.swing.*;
public class GameWindow extends JFrame
{
    public GameBoardPanel panel;
    public GameWindow(int radius,int numberOfPlayers/*,Controller controller*/)
    {
        this.setResizable(false);
        this.setSize(750,750);
        this.setLayout(null);


        panel = new GameBoardPanel(radius,null,/* controller,*/ numberOfPlayers);
        this.add(panel);

        this.setVisible(true);
    }
}