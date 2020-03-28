package FlyHigh.Resources;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class Stage1ScreenResources extends Resources {
    private static boolean loaded=false;
    private static Image backgroundImageDay,apple,berries,pear,grapes;
    public static void load(){
        if(!Resources.isLoaded()){
            Resources.load();
        }
        try {
            backgroundImageDay=ImageIO.read(Stage1ScreenResources.class.getClassLoader().getResource
                    ("FlyHigh/images/background-day.png"));
            apple=ImageIO.read(Stage1ScreenResources.class.getClassLoader().getResource
                    ("FlyHigh/images/apple.png"));
            berries=ImageIO.read(Stage1ScreenResources.class.getClassLoader().getResource
                    ("FlyHigh/images/berries.png"));
            pear=ImageIO.read(Stage1ScreenResources.class.getClassLoader().getResource
                    ("FlyHigh/images/pear.png"));
            grapes=ImageIO.read(Stage1ScreenResources.class.getClassLoader().getResource
                    ("FlyHigh/images/grapes.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage1ScreenResources.loaded=true;

    }

    public static Image getApple() {
        return apple;
    }

    public static Image getBerries() {
        return berries;
    }

    public static Image getPear() {
        return pear;
    }

    public static Image getGrapes() {
        return grapes;
    }

    public static boolean isLoaded() {
        return loaded;
    }

    public static Image getBackgroundImageDay() {
        return backgroundImageDay;
    }
}
