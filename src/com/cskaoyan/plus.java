package com.cskaoyan;

import java.util.Scanner;

public class plus {
    public static void main(String args[]){
        int[] nums = {1,5,4,3,6,8};
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入目标值target：");
        int target = scanner.nextInt();
        int i,j=0;
        for(i = 0;i < nums.length;++i){
            for(j = i+1;j<nums.length;++j)
            {
                if(nums[i]+nums[j]==target)
                {
                    System.out.println("参数1的数组下标为："+i);
                    System.out.println("参数2的数组下标为："+j);
                }
            }
            if(i==nums.length-1&&j==nums.length-1){
                System.out.println("无法匹配，请重新输入");
            }
        }
    }
}
