package com.homework;

public class Javaobject02 {
    public static void main(String args[]){
        double sum = 0;
        Student1[] students = new Student1[5];
        students[0] = new Student1(1,"张三",true,21,90);
        students[1] = new Student1(2,"李四",false,19,77);
        students[2] = new Student1(3,"王五",true,23,83);
        students[3] = new Student1(4,"赵二",true,20,70);
        students[4] = new Student1(5,"魏一",false,18,86);
        for(int i = 0; i < 5 ; ++i)
        {
            students[i].print();
            sum += students[i].java;
        }
        System.out.println("5名学生Java平均成绩为："+sum/5);
}
static class Student1{
    int id;
    String name;
    boolean gender;
    int age;
    int java;
    public void print()
    {
        System.out.println(name+"---"+age+"---"+(gender?"男":"女")+"---"+"Java分数："+java);
    }
    public Student1(int id,String name,boolean gender,int age,int java){
        this.java = java;
        this.gender = gender;
        this.age = age;
        this.name = name;
        this.id = id;
    }
}}
