package namn;
import java.util.Scanner;
class metoder{

    static void grad1(){
        int x = (int)Math.random()*101 + 1;
        byte y;

        do {

            y = new Scanner(System.in).nextByte();
            System.out.println();
            System.out.println(y<x? "mindre": y>x? "Större": "Rätt");

        }while (y!=x);
    }

    static void grad2(){
        int x = (int)(Math.random()*101);
        byte y;
        byte z = 0;

        do {
            z++;
            y = new Scanner(System.in).nextByte();
            System.out.println();
            System.out.println(y>x && z<3? "mindre": y<x && z<3? "Större": z == 3? "Du dog": "Rätt");
            
        }while (y!=x && z < 3);
    }

    static void grad3(){

        long x = (long)Math.random()*9e18+1;
        long y;
        System.out.println();
        System.out.println(y<x? "Du dog": y>x? "Du dog": "Rätt");
    }





    
}