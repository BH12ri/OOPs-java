package FlyHigh;

import FlyHigh.Resources.Resources;
import FlyHigh.Screen.Screen;
import FlyHigh.Screen.WelcomeScreen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

public class GamePanel extends JPanel implements Runnable,MouseListener,KeyListener {
    public static Screen currentScreen;
    public final static int HEIGHT=500;
    public final static int WIDTH=280;
    public static int SCORE=0;
    public GamePanel(){
        this.setPreferredSize(new Dimension(GamePanel.WIDTH,GamePanel.HEIGHT));
        this.addMouseListener(this);
        this.addKeyListener(this);
        this.setFocusable(true);

    }

    @Override
    public void addNotify() {
        super.addNotify();
        Resources.load();
        this.requestFocus();
        GamePanel.currentScreen=new WelcomeScreen();
        Thread t1=new Thread(this);
        t1.start();

    }

    @Override
    public void run() {
        Image bigImage=new BufferedImage(GamePanel.WIDTH,GamePanel.HEIGHT,BufferedImage.TYPE_INT_RGB);
        while(true) {
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            GamePanel.currentScreen.loadResources();
            GamePanel.currentScreen.update();
            Graphics image=bigImage.getGraphics();
            image.clearRect(0,0,GamePanel.WIDTH,GamePanel.HEIGHT);
            GamePanel.currentScreen.draw(image);
            image.dispose();
            Graphics graphics=this.getGraphics();
            graphics.drawImage(bigImage,0,0,null);
            graphics.dispose();



        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
      GamePanel.currentScreen.onMousePressed(e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
    GamePanel.currentScreen.onKeyPressed(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
