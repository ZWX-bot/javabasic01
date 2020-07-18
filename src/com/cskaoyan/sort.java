package com.cskaoyan;

public class sort {
    public static void main(String args[]){
        int[] a = new int[]{1,1,2,2,2,3,4};
        int length1 = a.length;
        //System.out.println(length1);
        for(int i = 0;i < a.length-1;++i){
            if(a[i]==a[i+1]){
                --length1;
            }
        }
        System.out.println(length1);
    }
}
