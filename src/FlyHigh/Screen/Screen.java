package FlyHigh.Screen;

import FlyHigh.Entity.Entity;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;


abstract public class Screen {
    protected List<Entity> entities=new ArrayList<>();

    public void draw(Graphics g){
    for(Entity e:entities){
        g.drawImage(e.image, e.x, e.y, null);
    }

    }
    public void update(){
        for (Entity e : entities) {
            e.update();
        }


    }
    abstract public void loadResources();
    abstract public void onMousePressed(MouseEvent e);
    abstract public void onKeyPressed(int keyCode);

    public static boolean areColliding(int animeXCord,int animeYCord,int animeWidth,int animeHeight,
                                       int blockXCord,int blockYCord,int blockWidth,int blockHeight) {
        boolean horizontalOverlap = (animeXCord > blockXCord && animeXCord < blockXCord + blockWidth)
                || (blockXCord > animeXCord && blockXCord < animeXCord + animeWidth);
        boolean verticalOverlap = (animeYCord > blockYCord && animeYCord < blockYCord + blockHeight) ||
                (blockYCord > animeYCord && blockYCord < animeYCord + animeHeight);

        return horizontalOverlap && verticalOverlap;
    }
}
