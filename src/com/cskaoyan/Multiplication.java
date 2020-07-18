package com.cskaoyan;

public class Multiplication {
    public static void main(String args[]){
        int x,y;
        for(x=1;x<=9;++x){
            for(y=1;y<=x;++y){
                System.out.print(x+"*"+y+"="+(x*y)+" ");
            }
            System.out.println();
        }
    }
}
