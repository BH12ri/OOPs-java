package FlyHigh.Resources;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class WelcomeScreenResources extends Resources {
    private static boolean loaded;
    private static Image message,selectorLeft,selectorRight;
    public static void load(){
        if(!Resources.isLoaded()){
            Resources.load();
        }
        try {
            message=ImageIO.read(WelcomeScreenResources.class.getClassLoader().getResource
                    ("FlyHigh/images/message.png"));
            selectorLeft=ImageIO.read(WelcomeScreenResources.class.getClassLoader().getResource
                    ("FlyHigh/images/selector_left.png"));
            selectorRight=ImageIO.read(WelcomeScreenResources.class.getClassLoader().getResource
                    ("FlyHigh/images/selector_right.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        WelcomeScreenResources.loaded=true;

    }

    public static Image getMessage() {
        return message;
    }

    public static Image getSelectorLeft() {
        return selectorLeft;
    }

    public static Image getSelectorRight() {
        return selectorRight;
    }

    public static boolean isLoaded() {
        return loaded;
    }
}
