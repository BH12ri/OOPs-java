package FlyHigh.Screen;

import FlyHigh.Entity.Points;
import FlyHigh.Entity.Player;
import FlyHigh.GamePanel;
import FlyHigh.Resources.Resources;
import FlyHigh.Resources.Stage1ScreenResources;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Stage1Screen extends Screen {
    private static int SCORE=0;
    private static String displayScore;
    private Player player;
    private List<Points> points=new ArrayList<>();

    public Stage1Screen(){
        this.points.add(new Points(20,-50));
        this.points.add(new Points(100,-70));
        this.points.add(new Points(150,-100));
        this.points.add(new Points(200,-55));
        this.player=new Player(30,100);
        this.entities.add(this.player);
        this.entities.addAll(this.points);



    }

    @Override
    public void draw(Graphics g) {

        g.drawImage(Stage1ScreenResources.getBackgroundImageDay(),0,0,null);
        Stage1Screen.displayScore=Integer.toString(SCORE);
        g.drawString(displayScore,10,10);
        super.draw(g);



        }


    @Override
    public void update() {
        super.update();
       if(this.player.y>=GamePanel.HEIGHT-Player.HEIGHT){
           GamePanel.currentScreen=new GameOverScreen();
       }
       for(Points p:points){
           if (areColliding(player.x,player.y, Player.WIDTH, Player.HEIGHT,
                   p.x, p.y, p.WIDTH, p.HEIGHT)){
               Random r=new Random();
               int randomNumber=r.nextInt(240);
               p.y=-20;
               p.x=randomNumber;
               SCORE=SCORE+1;

           }

       }



           }

    @Override
    public void loadResources() {
        if(!Stage1ScreenResources.isLoaded()){
            Stage1ScreenResources.load();
        }
    }

    @Override
    public void onMousePressed(MouseEvent e) {

    }

    @Override
    public void onKeyPressed(int keyCode) {
        if(keyCode==KeyEvent.VK_SPACE&&this.player.y>40){
            this.player.y-=40;
            Resources.getJumpAudio().play();
        }
        if(keyCode==KeyEvent.VK_UP&&this.player.y>20){
            this.player.y-=20;
        }
        if(keyCode==KeyEvent.VK_DOWN&&this.player.y<GamePanel.HEIGHT-20){
            this.player.y+=20;
        }
        if(keyCode==KeyEvent.VK_LEFT&&this.player.x>30){
            this.player.x-=30;
        }
        if(keyCode==KeyEvent.VK_RIGHT&&this.player.x<GamePanel.WIDTH-40){
            this.player.x+=30;
        }


    }
}
