package gissSpel;
import java.util.Scanner;

class metoder{

    static void grad1(byte liv){
        
        byte x = (byte)(Math.random()*101 + 1);
        byte y;
        byte z = 0;
        do {
            liv--;
            z++;
            y = new Scanner(System.in).nextByte();
            System.out.println(y>x? "mindre": y<x? "Större": "Rätt svaret va: " + x + " " + z + " försök");
            
            if (liv<1) {
                System.out.println("du dog, skulle gissat " + x +"\n");
                break;       
            }

        }while (y!=x);
    }





    
}