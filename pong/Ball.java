package pong;
import java.awt.*;

public class Ball {

    private int x, y, cx, cy, speed, size;
    private Color color;

    public Ball(int x, int y, int cx, int cy, int speed, Color color, int size){
        this.x = x;
        this.y = y;
        this.cx = cx;
        this.cy = cy;
        this.speed = speed;
        this.color = color;
        this.size = size;
    }
    
    public void paint(Graphics g){
        g.setColor(color);
        g.fillOval(x, y, size, size);
        
    }
    
    public void moveBall(){
        x += cx;
        y += cy;
    }

    public void bounceOffEdge(int top, int bottom){
        if(y > bottom - size){reverseY();}
        else if(y < top){reverseY();}
    }
    public void reverseX(){
        cx *= -1;}
        
    public void reverseY(){
        cy *= -1;}

    public int getY(){return y;}
    public void setY(int y){this.y = y;}

    public int getX(){ return x;}
    public void setX(int x){ this.x = x;}

    public int getSize(){return size;}

    public void setCx(int cx){this.cx=cx;}
    public void setCy(int cy){this.cy=cy;}
    public void setSpeed(int speed){this.speed =speed;}
}
