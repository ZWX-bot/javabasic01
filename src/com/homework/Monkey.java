package com.homework;

import java.util.Scanner;

public class Monkey {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第几天：");
        int day = scanner.nextInt();
        int result = count(day);
        System.out.println("第"+day+"天"+"还有"+result+"个桃子");
    }
    public static int count(int n)
    {
        if(n==10)
            return 1;
        else
            return 2*(count(n+1)+1);
    }
}
