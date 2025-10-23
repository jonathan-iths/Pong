package pong;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.*;


public class Pongam extends JPanel implements KeyListener{
    
    static final int WINDOW_WIDTH = 640, WINDOW_HEIGHT = 480;
    private Ball gameBall;
    private Paddle mePaddle, uPaddle;
    private int meScore, uScore;

    public void paintComponent(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0,0,WINDOW_WIDTH,WINDOW_HEIGHT);
        gameBall.paint(g);
        mePaddle.paint(g);
        uPaddle.paint(g);
        g.drawString(meScore + "        " + uScore, 0, 5);

    }

    public Pongam(){
        gameBall = new Ball(300, 200, 3, 3, 3, Color.WHITE, 10);
        mePaddle = new Paddle(10, 200, 75, 10, Color.WHITE);
        uPaddle = new Paddle(610, 200, 75, 10, Color.WHITE);
        addKeyListener(this);
        setFocusable(true);
        meScore =0; uScore=0; 
    }

    public void gameLogic(){

        gameBall.moveBall();
        gameBall.bounceOffEdge(0, WINDOW_HEIGHT);
        uPaddle.moveTowards(gameBall.getY());
        if(mePaddle.checkCollision(gameBall)){gameBall.reverseX();}
        if(uPaddle.checkCollision(gameBall)){gameBall.reverseX();}
  
    }
    


    @Override
   public void keyPressed(KeyEvent e) {

       switch ((e.getKeyCode())) {
            case KeyEvent.VK_W:
                mePaddle.moveUp();
            break;
    
            case KeyEvent.VK_S:
                mePaddle.moveDown();
            break;
    }
}

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    }



}
