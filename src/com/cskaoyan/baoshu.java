package com.cskaoyan;

import java.util.Scanner;

public class baoshu {
    public static void main(String args[]){
        System.out.println("请输入人数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = Find(n);
        System.out.println(num);
    }
    public  static int Find(int n)
    {
        int sum = 0,i,result=0;
        int count1=0,count2=0;//计数 1-3
        int[] person = new int[n];
        for(i = 0;i<person.length;i++)
        {
            person[i] = i+1;
        }
        while(count2!=n-1)
        {
            for(i=0;i<person.length;++i){
                if(person[i]!=0)
                {
                    count1++;
                    if(count1==3)
                    {
                        person[i]=0;
                        count1=0;
                        count2++;
                    }
                }
                else
                    continue;
            }
        }
        for(i=0;i<person.length;++i)
        {
            if(person[i]!=0)
                result = person[i];
        }
        return result;
    };
}
