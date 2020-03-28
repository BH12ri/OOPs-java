package FlyHigh.Entity;



import FlyHigh.Resources.Stage1ScreenResources;

import java.awt.*;
import java.util.Random;


public class Points extends Entity {
    public static int WIDTH=0, HEIGHT=0;

    public Points(int x, int y){
        super(x,y);

    }
    public void update(){
        Random r=new Random();
        if(y>500||y<-42){
            image=FruitImage.load();
            WIDTH=FruitImage.WIDTH;
            HEIGHT=FruitImage.HEIGHT;
            int XRandom=r.nextInt(240);
            x=XRandom;
            int YRandom=r.nextInt(10);
            if(YRandom==0)
                yVel=3;
            else
                yVel=YRandom;
            y=-20;
        }

        super.update();

    }
}
