package FlyHigh.Resources;

import javax.imageio.ImageIO;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.io.IOException;

public class Resources {
    private static Image pipeGreen;

    private static Image[] redBird=new Image[3];
    private static Image[] yellowBird=new Image[3];
    private static Image[] blueBird=new Image[3];
    private static Image[] selectPlayer=new Image[3];
    private static AudioClip jumpAudio,hit;

    private static Image fenceDown;
    private static boolean loaded=false;

    public static void load(){
        jumpAudio= Applet.newAudioClip(Resources.class.getClassLoader().getResource
                ("FlyHigh/audios/onjump.wav"));
        hit= Applet.newAudioClip(Resources.class.getClassLoader().getResource
                ("FlyHigh/audios/hit.wav"));
        try {

            pipeGreen=ImageIO.read(Resources.class.getClassLoader().getResource
                    ("FlyHigh/images/hurdles/pipe-green.png"));
            fenceDown=ImageIO.read(Resources.class.getClassLoader().getResource
                    ("FlyHigh/images/hurdles/fence_down.png"));
            redBird[0]=ImageIO.read(Resources.class.getClassLoader().getResource
                    ("FlyHigh/images/player/redbird-downflap.png"));
            redBird[1]=ImageIO.read(Resources.class.getClassLoader().getResource
                    ("FlyHigh/images/player/redbird-midflap.png"));
            redBird[2]=ImageIO.read(Resources.class.getClassLoader().getResource
                    ("FlyHigh/images/player/redbird-upflap.png"));
            yellowBird[0]=ImageIO.read(Resources.class.getClassLoader().getResource
                    ("FlyHigh/images/player/yellowbird-downflap.png"));
            yellowBird[1]=ImageIO.read(Resources.class.getClassLoader().getResource
                    ("FlyHigh/images/player/yellowbird-midflap.png"));
            yellowBird[2]=ImageIO.read(Resources.class.getClassLoader().getResource
                    ("FlyHigh/images/player/yellowbird-upflap.png"));
            blueBird[0]=ImageIO.read(Resources.class.getClassLoader().getResource
                    ("FlyHigh/images/player/bluebird-downflap.png"));
            blueBird[1]=ImageIO.read(Resources.class.getClassLoader().getResource
                    ("FlyHigh/images/player/bluebird-midflap.png"));
            blueBird[2]=ImageIO.read(Resources.class.getClassLoader().getResource
                    ("FlyHigh/images/player/bluebird-upflap.png"));
            selectPlayer[0]=redBird[0];
            selectPlayer[1]=yellowBird[0];
            selectPlayer[2]=blueBird[0];

            loaded=true;


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static Image getPipeGreen() {
        return pipeGreen;
    }

    public static Image[] getRedBird() {
        return redBird;
    }

    public static Image[] getYellowBird() {
        return yellowBird;
    }

    public static Image[] getBlueBird() {
        return blueBird;
    }

    public static Image getFenceDown() {
        return fenceDown;
    }

    public static Image[] getSelectPlayer() {
        return selectPlayer;
    }

    public static boolean isLoaded() {
        return loaded;
    }

    public static AudioClip getJumpAudio(){
        return jumpAudio;
    }

    public static AudioClip getHitAudio(){
        return hit;
    }
}
