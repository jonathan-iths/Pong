package pong;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Paddle{

    private int height, x,y ,speed;
    private Color color;


    static final int PADDLE_WIDTH = 17;


    public Paddle(int x,int y, int height, int speed, Color color){

        this.x = x;
        this.y = y;
        this.height = height;
        this.speed = speed;
        this.color = color;
    }

    public void paint(Graphics g){

        g.setColor(color);
        g.fillRect(x, y, PADDLE_WIDTH, height);}

    public void moveUp(){
        y -= speed;}

    public void moveDown(){
        y += speed;}

    public void moveTowards(int moveToY){
        int centerY = y+height/2;

        if(Math.abs(centerY-moveToY)> speed){
            if(centerY >moveToY){
                y-=speed;}
        }

        if(centerY < moveToY){
            y +=speed;}
    }
    
    public int getX(){return x;}
    public int getY(){return y;}



    public boolean checkCollision(Ball b){
        int rightX = x + PADDLE_WIDTH +5;
        int bottomY = y + height + 5;
        if(b.getX() > (x - b.getSize()) && b.getX() < rightX){
            if(b.getY() > y  && b.getY() < bottomY){
                return true;
            }
        }
        return false;
    }
}