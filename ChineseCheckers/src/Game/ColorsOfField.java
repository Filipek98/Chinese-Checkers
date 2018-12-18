package src.Game;

import PartsOfGame.PlayerColor;

import java.awt.*;

public class ColorsOfField {

    private Color pawnYellow, pawnBlack, pawnGreen, pawnBlue, pawnRed, pawnWhite, fieldYellow, fieldBlack, fieldGreen, fieldBlue, fieldRed, fieldWhite;
    public Color empty;
    public Color selected;

    public ColorsOfField(){
        pawnYellow=new Color(250,250,0);
        pawnBlack=new Color(0,0,0);
        pawnGreen=new Color(36,165,11);
        pawnBlue=new Color(37,63, 230);
        pawnRed=new Color(170,36, 19);
        pawnWhite=new Color(255,255,255);
        empty=new Color(200,200,200);
        selected=new Color(200,50,50);
        fieldYellow=new Color(255,250,148);
        fieldBlack=new Color(91,91,92);
        fieldGreen=new Color(169,218,106);
        fieldBlue=new Color(187,208,240);
        fieldRed=new Color(200,114,93);
        fieldWhite=new Color(191,200,182);
    }
    Color getPawnColor(PlayerColor c){
        switch (c){
            case RED: return pawnRed;
            case BLUE: return pawnBlue;
            case BLACK: return pawnBlack;
            case GREEN: return pawnGreen;
            case WHITE: return pawnWhite;
            default:return pawnYellow;
        }
    }
    Color getFieldColor(PlayerColor c){
        switch (c){
            case RED: return pawnRed;
            case BLUE: return pawnBlue;
            case BLACK: return pawnBlack;
            case GREEN: return pawnGreen;
            case WHITE: return pawnWhite;
            default:return pawnYellow;
        }
    }

}
