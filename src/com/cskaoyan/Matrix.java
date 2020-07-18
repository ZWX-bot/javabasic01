package com.cskaoyan;

import java.util.Scanner;
// 输入一个 m*n的矩阵 和一个n*p的矩阵，并初始化, 要求打印出两个矩阵的乘积。
public class Matrix {
    public static void main(String args[]){
        int m,n,p;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入m：");
        m = scanner.nextInt();
        System.out.println("请输入n：");
        n = scanner.nextInt();
        System.out.println("请输入p：");
        p = scanner.nextInt();
        int[][] a = new int[m][n];
        int[][] b = new int[n][p];
        for(int i = 0;i < m;++i) {
            for(int j = 0;j<n;++j) {
                a[i][j] = scanner.nextInt();
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(int i = 0;i < n;++i) {
            for(int j = 0;j<p;++j) {
                b[i][j] = scanner.nextInt();
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-------------矩阵a*b-------------");
        int[][] c = new int[m][p];
        for(int i = 0;i < m; i++) {
            for(int j = 0;j < p; j++) {
                for(int k =0;k < n; k++) {
                    c[i][j] = c[i][j]+a[i][k] * b[k][j];
                }
            }
        }
        for (int i = 0; i < m; i++){
            for (int j = 0; j < p; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
}
}
