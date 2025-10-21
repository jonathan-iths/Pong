package pong;
import java.awt.*;
import javax.swing.JPanel;


public class Pongam extends JPanel{
    
    static final int WINDOW_WIDTH = 640, WINDOW_HEIGHT = 480;
    private Ball gameBall;

    public void paintComponent(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0,0,WINDOW_WIDTH,WINDOW_HEIGHT);
        gameBall.paint(g);

    }

    public Pongam(){
        gameBall = new Ball(300, 200, 3, 3, 3, Color.BLUE, 10);
}

    public void gameLogic(){

        gameBall.moveBall();
        gameBall.bounceOffEdge(0, WINDOW_HEIGHT);
    }
}
