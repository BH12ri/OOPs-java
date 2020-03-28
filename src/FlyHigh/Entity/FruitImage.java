package FlyHigh.Entity;

import FlyHigh.Resources.Stage1ScreenResources;

import java.awt.*;
import java.util.Random;

public class FruitImage {
    public static int WIDTH=0, HEIGHT=0;
    public static Image load(){
        Random r=new Random();
        int index=r.nextInt(4);
        if(index==0){
            WIDTH=33;
            HEIGHT=32;
            return Stage1ScreenResources.getApple();
        }
        else if(index==1){
            WIDTH=30;
            HEIGHT=42;
            return Stage1ScreenResources.getBerries();
        }
        else if(index==2){
            WIDTH=33;
            HEIGHT=32;
            return Stage1ScreenResources.getPear();
        }
        else
            WIDTH=30;
            HEIGHT=42;
            return Stage1ScreenResources.getGrapes();


    }
}
