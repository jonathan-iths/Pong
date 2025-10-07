package cha3;

public class tid {
    private int h, m , s;

    public int getH() {return this.h;}
    public void setH(int h) {this.h = h;}

    public int getM() {return this.m;}
    public void setM(int m) {this.m = m;}

    public int getS() {return this.s;}
    public void setS(int s) {this.s =s;}

    public void toString1(){
        System.out.printf("%02d:%02d:%02d",h,m,s);
    }

    public void toString12(){
        int newH = (h== 0 || h == 12)? 12: h % 12;
        String x = (h < 12) ? "AM" : "PM";
        System.out.printf("%02d:%02d:%02d %s", newH,m,s, x);
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

    

