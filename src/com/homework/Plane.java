package com.homework;

import java.util.Scanner;

public class Plane {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入直线条数：");
        int n = scanner.nextInt();
        int result = count(n);
        System.out.println(n+"条直线最多可将平面分为"+result+"块");
    }
    public static int count(int n){
        if(n==1)
        {
            return 2;
        }
        else {
            return count(n-1)+n;
        }
    }
}
