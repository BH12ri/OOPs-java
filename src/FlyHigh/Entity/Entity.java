package FlyHigh.Entity;

import java.awt.*;

public abstract class Entity {
    public int x,y;
    public int xVel,yVel;
    public Image image;
    public Entity(int XCord,int YCord){
        this(XCord,YCord,0,3);
    }

    public Entity(int XCord,int YCord,int xVelocity,int yVelocity){
        this.x=XCord;
        this.y=YCord;
        this.xVel=xVelocity;
        this.yVel=yVelocity;
    }
    public void update(){
        y+=yVel;
    }
}
