package FlyHigh.Entity;

import FlyHigh.Resources.Resources;
import FlyHigh.Screen.WelcomeScreen;
import FlyHigh.Screen.Stage1Screen;


import java.awt.*;

public class Player extends Entity{
    public static final int WIDTH=34,HEIGHT=24;
    private static Image player[];
    private static int playerCounter=0;

    public Player(int x,int y){
        super(x,y);

    }


    public void update(){
        if(WelcomeScreen.getPlayerCounter()==0)
            player=Resources.getRedBird();
        else if(WelcomeScreen.getPlayerCounter()==1)
            player=Resources.getYellowBird();
        else if(WelcomeScreen.getPlayerCounter()==2)
            player=Resources.getBlueBird();
        if(playerCounter>=player.length-1)
            playerCounter=0;
        else
            playerCounter++;
        image=player[playerCounter];
        super.update();

    }

}
