package cha3;

public class tid {
    int h;
    int m;
    int s;
    
    if (h<0 || h>24 || m<0 || m>59 || s<0 || s>59)
            throw new IllegalArgumentException("Time: Bad value:" + h + ":" + m + ":" + s);


    tid(int h){
        this.h = h;

            
        }

    }

    tid(int h, int m){
        this.h =h;
        this.m =m;



    }

    tid(int h, int m, int s){
        this.s=s;
        this.h =h;
        this.m =m;



    }
    
}
