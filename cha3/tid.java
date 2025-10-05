package cha3;

public class tid {
    int h;
    int m;
    int s;
    
    int getH(){
        return this.h;
    }
    int getM(){
        return this.m;
    }
    int getS(){
        return this.s;
    }
    void setH(int h){
        this.h = h;
    }
    void setM(int m){
        this.m = m;
    }
    void setS(int s){
        this.s =s;
    }

    static void toString1(int h,int m,int s){
        System.out.print(m<10? h + ":" + "0" + m +":" + s: h + ":" + m +":" + s);
    }

    static void toString12(int h, int m, int s){
        String x = "AM";
        if(h>12){
            h = h-12; x = "PM";
        }
        if(h==12){
            x = "PM";
        } 
        toString1(h,m,s);
        System.out.print(" " + x);
    }

    tid(){
    }

    tid(int h){
        this.h = h;       
        }

    tid(int h, int m){
        this.h =h;
        this.m =m;
    }

    tid(int h, int m, int s){
        if (h<0 || h>23 || m<0 || m>59 || s<0 || s>59){
            throw new IllegalArgumentException("Time: Bad value:" + h + ":" + m + ":" + s);
    }
        this.s=s;
        this.h =h;
        this.m =m;
    }

}

    

