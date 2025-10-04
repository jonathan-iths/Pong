package gissSpel;
import java.util.Scanner;

class main{
    public static void main(String[] args) {

        System.out.println("1. gissa 99 liv\n2. gissa 3 liv\n3. gissa 1 liv");
        int val = new Scanner(System.in).nextInt();

        if (val == 1) {
            metoder.grad1((byte)99);
            
        }else if (val == 2) {
            metoder.grad1((byte)3);
        }
        else{
            metoder.grad1((byte)1);
        }
    }



}