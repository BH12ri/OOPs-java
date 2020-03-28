package FlyHigh.Screen;

import FlyHigh.Entity.Player;
import FlyHigh.GamePanel;
import FlyHigh.Resources.Resources;
import FlyHigh.Resources.WelcomeScreenResources;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;



public class WelcomeScreen extends Screen {
    private static boolean playerSelected=false;
    private static Image[] choosePlayer;
    private static int playerCounter=0;
    private static final int SELECTOR_WIDTH=25,SELECTOR_HEIGHT=45;
    private static int selectorYCord=(GamePanel.HEIGHT-SELECTOR_HEIGHT)/2;
    @Override
    public void draw(Graphics g) {

        if(playerSelected){
        g.drawImage(WelcomeScreenResources.getMessage(),48,116,null);
        }else{
            choosePlayer=Resources.getSelectPlayer();
            g.setColor(Color.red);
            g.setFont(new Font("Arial",Font.PLAIN,30));
            g.drawString("Choose Player",45,190);
            g.setFont(new Font("Arial",Font.PLAIN,10));
            g.drawString("(Press Enter to select)",85,210);
            g.drawImage(WelcomeScreenResources.getSelectorLeft(),10,selectorYCord,null);
            g.drawImage(WelcomeScreenResources.getSelectorRight(),(GamePanel.WIDTH-(SELECTOR_WIDTH+10)),selectorYCord,null);
            g.drawImage(choosePlayer[playerCounter],(GamePanel.WIDTH-Player.WIDTH)/2,(GamePanel.HEIGHT-Player.HEIGHT)/2,null);


        }

    }

    @Override
    public void update() {


    }

    @Override
    public void loadResources() {
     if(!WelcomeScreenResources.isLoaded()){
         WelcomeScreenResources.load();
     }

    }

    @Override
    public void onMousePressed(MouseEvent e) {
     if(playerSelected){
         //Until there is a tap on screen Stage1Screen should not be displayed.
         GamePanel.currentScreen=new Stage1Screen();
     }

     if(!playerSelected){
     if((e.getX()>=10&&e.getX()<=SELECTOR_WIDTH+10)&&
             (e.getY()>=selectorYCord&&e.getY()<=selectorYCord+SELECTOR_HEIGHT)){
         if(playerCounter<=0)
             playerCounter=choosePlayer.length-1;
         else
             playerCounter--;
     }
     if(e.getX()>=(GamePanel.WIDTH-(SELECTOR_WIDTH+10))&&e.getX()<=(GamePanel.WIDTH-10)&&
             (e.getY()>=selectorYCord&&e.getY()<=selectorYCord+SELECTOR_HEIGHT)){
         if(playerCounter>=choosePlayer.length-1)
             playerCounter=0;
         else
             playerCounter++;
            }
        }


    }

    public static int getPlayerCounter() {
        return playerCounter;
    }

    @Override
    public void onKeyPressed(int keyCode) {
        if(!playerSelected){
            if(keyCode== KeyEvent.VK_ENTER){
                playerSelected=true;
            }


        }


    }
}
