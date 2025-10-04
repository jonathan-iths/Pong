package cha1;

import java.util.Scanner;import java.util.Arrays;


public class metoder {

    static void posNeg(){
        int num = new Scanner(System.in).nextInt();
        System.out.println(num < 0? "neg": num > 0? "pos": "zer");
    }

    static void large(){

        String var = new Scanner(System.in).nextLine();
        int a = Integer.valueOf(var.substring(0,1));
        int b = Integer.valueOf(var.substring(1,2));
        int c = Integer.valueOf(var.substring(2,3));
        int d = Math.max(a,b);
        System.out.println(Math.max(d,c));
    }
    
    static void posNeg2(){

        double num = new Scanner(System.in).nextDouble();
        String storlek = num < 1? "litet": num > 1000000? "stort": "";
        String pN = num < 0? "neg": num > 0? "pos": "zer";
        System.out.println(storlek +" "+ pN);

    }

    static void veckoD(){
        
        String[] dagar = {"måndag","tisdag", "onsdag", "torsdag", "fredag", "lördag", "söndag"};
        int s = new Scanner(System.in).nextInt();
        System.out.println(dagar[s-1]);
    }

    static void konVok(){

        String[] vok = {"a", "e", "i", "o", "u", "y", "å", "ä", "ö"};
        String[] kon = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z"};
        String var = new Scanner(System.in).nextLine().toLowerCase();
        System.out.println(Arrays.asList(vok).contains(var)? "vok": Arrays.asList(kon).contains(var)? "kon": "Wronginput"); 

    }

    static void mult(){

        int num = new Scanner(System.in).nextInt();
        int[] table = {2,3,4,5,6,7,8,9,10};
        for(int i:table){
            System.out.println(num*i);

        }

    }


    
}
