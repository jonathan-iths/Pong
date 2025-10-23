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
    Action upAction;
    Action downAction;

    public void paintComponent(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0,0,WINDOW_WIDTH,WINDOW_HEIGHT);
        gameBall.paint(g);
        mePaddle.paint(g);
        uPaddle.paint(g);
        g.drawString(meScore + "        " + uScore, 200, 200);

    }

    public Pongam(){
        gameBall = new Ball(300, 200, 6, 6, 10, Color.WHITE, 10);
        mePaddle = new Paddle(10, 200, 75, 7, Color.WHITE);
        uPaddle = new Paddle(610, 200, 75, 7, Color.WHITE);
        //addKeyListener(this);
        setFocusable(true);
        upAction = new UpAction();
        downAction = new DonwAction();
        mePaddle.getInputMap().put(KeyStroke.getKeyStroke('w',"wAction"));
        mePaddle.getActionMap().put("wAction", upAction);
        meScore =0; uScore=0; 
    }

    public void gameLogic(){

        gameBall.moveBall();
        gameBall.bounceOffEdge(0, WINDOW_HEIGHT);
        uPaddle.moveTowards(gameBall.getY());
        if(mePaddle.checkCollision(gameBall)){gameBall.reverseX();}
        if(uPaddle.checkCollision(gameBall)){gameBall.reverseX();}
        if(gameBall.getX() < 0){ uScore++; reset();}
        else if(gameBall.getX() > WINDOW_WIDTH){ meScore++;reset();}
  
    }
    public void reset(){
        gameBall.setX(300);
        gameBall.setY(200);
        gameBall.setCx(6);
        gameBall.setCy(6);
        gameBall.setSpeed(10);
    }
    public class UpAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            mePaddle.setLocation(mePaddle.getX(), mePaddle.getY()-10);
        }

    }

    public class DonwAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            mePaddle.setLocation(mePaddle.getX(), mePaddle.getY()+10);
        }

    }
    
/* 
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

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }
*/


}
