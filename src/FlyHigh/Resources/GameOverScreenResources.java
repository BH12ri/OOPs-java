package FlyHigh.Resources;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class GameOverScreenResources extends Resources {
    private static Image gameOver;
    private static boolean loaded=false;
    public static void load(){
        if(!Resources.isLoaded()){
            Resources.load();
        }
        try {
            gameOver=ImageIO.read(GameOverScreenResources.class.getClassLoader().getResource
                    ("FlyHigh/images/gameover.png"));

            } catch (IOException e) {
            e.printStackTrace();
        }
        GameOverScreenResources.loaded=true;

    }

    public static Image getGameOver() {
        return gameOver;
    }

    public static boolean isLoaded() {
        return loaded;
    }
}
