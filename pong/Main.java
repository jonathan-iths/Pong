package pong;
import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
     
    JFrame frame = new JFrame("test");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(650,495);
    Pongam game = new Pongam();
    frame.add(game);
    frame.setVisible(true);
    game.requestFocusInWindow();
    File file = new File("pong\\pixel.wav");
    AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
    Clip clip = AudioSystem.getClip();
    clip.open(audioStream);
    clip.start();


    Timer timer = new Timer(10, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
            try {
                game.gameLogic();
            } catch (UnsupportedAudioFileException | IOException | LineUnavailableException bajs) {

                bajs.printStackTrace();
            }
            game.repaint();

        }
    });

    timer.start();

}}
