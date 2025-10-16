package classer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        //Båt mbåt = new Båt();
        //mbåt.go();
        Bil mbil = new Bil();
        mbil.drive(100);
        
    }
    
}

class Fordon {
    int vikt;
    int pris;
    
}

class Bil extends Fordon implements Land{
    public void drive(int km) {
        for(int i = 0; i < km+1; i++){
        System.out.printf("\rKm räknare %d",i);
        try{
            Thread.sleep(70);
        } catch (InterruptedException e) {}}
    }
}

class Båt extends Fordon implements Hav{
    public void go(){
        Random r = new Random();
            double lat = -90 + r.nextDouble()*180;
            double lon = -180 + r.nextDouble()*360;
            System.out.printf("%.7f°%s, %.7f°%s",Math.abs(lat),lat>=0? "N":"S",Math.abs(lon),lon>=0?"E":"W");
        }


}

interface Land{
    void drive(int km);

}

interface Hav{
    void go();

}
