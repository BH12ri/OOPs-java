package FlyHigh.Screen;

import FlyHigh.Resources.GameOverScreenResources;

import java.awt.*;
import java.awt.event.MouseEvent;

public class GameOverScreen extends Screen {

    public void draw(Graphics g){
    g.drawImage(GameOverScreenResources.getGameOver(),44,200,null);

    }
    public void update(){

    }
    @Override
    public void loadResources() {
        if(!GameOverScreenResources.isLoaded()){
            GameOverScreenResources.load();
        }
    }

    @Override
    public void onMousePressed(MouseEvent e) {

    }

    @Override
    public void onKeyPressed(int keyCode) {

    }
}
