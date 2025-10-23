package pong;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {

    public static void main(String[] args) {
        
    JFrame frame = new JFrame("test");

    frame.setLayout(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(650,495);
    Pongam game = new Pongam();
    frame.add(game);
    frame.setVisible(true);
    game.requestFocusInWindow();

    Timer timer = new Timer(10, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
            game.gameLogic();
            game.repaint();
        }
    });

    timer.start();
}}
