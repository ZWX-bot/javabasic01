package com.cskaoyan.homework;

public class Day08JavaObject02 {
   public static void main(String args[]){
       final int a = 1;//第一种方式
       System.out.println(a);
       final int b;
       {
           b=3;
       }//构造代码块中可以赋初值
       System.out.println(b);
       A c = new A(6);
       c.print();//构造函数赋初值
   }
}
class A{
   final int c;
   public A(int c){
       this.c = c;
   }
   public void print(){
       System.out.println(c);
   }
}