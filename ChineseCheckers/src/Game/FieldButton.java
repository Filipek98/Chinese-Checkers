package src.Game;

import PartsOfGame.Pawn;

import javax.swing.*;
import java.awt.*;

public class FieldButton extends JButton{
    private int x,y;
    private Pawn pawn;
    private Color defaultColor;

    public FieldButton(int x, int y){
        super();
        this.x=x;
        this.y=y;
    }

    public int getx() {
        return x;
    }

    public int gety() {
        return y;
    }

    Pawn getPawn() {
        return pawn;
    }

    public void setPawn(Pawn pawn){
        this.pawn=pawn;
    }

    void setDefaultColor(Color c){
        this.defaultColor=c;
    }
    void colorPawn(ColorsOfField c){
        if(this.pawn!=null){
            this.setBackground(c.getPawnColor(pawn.getColor()));
        }else{
            this.setDefaultBackgroundColor();
        }
    }
    void setDefaultBackgroundColor(){
        this.setBackground(defaultColor);
    }

}
