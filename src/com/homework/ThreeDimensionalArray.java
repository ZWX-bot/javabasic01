package com.homework;

import java.util.Arrays;

public class ThreeDimensionalArray {
    public static void main(String args[]){
        //定义一个三维数组，并初始化之。
        //写一个打印函数，负责打印三维数组中的数据，并测试。
        int[][][] array = new int[2][3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = i + j + k;
                }
            }
        }

        Array_Print(array);
    }

    private static void Array_Print(int[][][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("a["+ i +"][" + j + "] = "+ Arrays.toString(a[i][j]));
            }
        }

    }
}
