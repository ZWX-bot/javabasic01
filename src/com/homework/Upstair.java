package com.homework;

import java.util.Scanner;

public class Upstair {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入楼梯数：");
        int n = scanner.nextInt();
        int result = count(n);
        System.out.println(result);
    }
    public static int count(int n){
        int count1 = 0;
        if(n==1)
        {
            count1 = 1;
        }
        else if(n==2)
        {
            count1 = 2;
        }
        else {
            count1 = count(n-1)+count(n-2);
        }
        return count1;
    }
}
