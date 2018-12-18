package src.Game;


import PartsOfGame.Field;
import PartsOfGame.GameboardCreator;
import src.Game.ColorsOfField;
import src.Game.FieldButton;

import javax.swing.*;
import java.awt.*;


public class GameBoardPanel extends JPanel
{
    private FieldButton[][] board;
	private ColorsOfField colors;
    GameBoardPanel(int radius, Color player, int numberOfPlayers)
    {
        int size = 4 * radius + 1;
        this.board = new FieldButton[size][size];
		colors=new ColorsOfField();

        this.setLayout(null);
        this.setSize(750, 750);

        Field[][] board = new GameboardCreator(radius,numberOfPlayers).getBoard();

        int portion = 600 / (2 * size);
        int baseX = 350;
        int baseY = 350;
        int tempX, tempY;
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                if (board[x][y] != null) {
                    tempX = baseX + (portion * 2 * (board[x][y].getX()));
                    tempX = tempX + (((board[x][y].getY()) * portion));
                    tempY = baseY + (portion * 2 * (board[x][y].getY()));

                    FieldButton b = new FieldButton(x,y);
                    b.setBounds(tempX, tempY, 20, 20);
                    b.setPawn(board[x][y].getPawn());

                     if(board[x][y].getColor()==null){
                        b.setBackground(colors.empty);
                    }else{
                        b.setBackground(colors.getPawnColor(board[x][y].getColor()));
                    }
                    if(board[x][y].getColor()==null){
                        b.setDefaultColor(colors.empty);
                    }else{
                        b.setDefaultColor(colors.getFieldColor(board[x][y].getColor()));
                    }
                    b.colorPawn(colors);

                    this.board[x][y] = b;
                    this.add(b);
                }
            }
        }
        this.repaint();
    }
}