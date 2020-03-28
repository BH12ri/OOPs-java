package FlyHigh;


import javax.swing.*;

public class FlyHighMain {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        GamePanel panel=new GamePanel();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
