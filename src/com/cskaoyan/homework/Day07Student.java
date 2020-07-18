package com.cskaoyan.homework;

public class Day07Student {
    public static void main(String args[]){
        //Student student = new Student();
        Student.initialize();
        Student.initialize();
        Student.initialize();
        Student.initialize();
        Student.initialize();
        Student.initialize();
        Student.initialize();
        Student.initialize();
        Student.initialize();
        Student.initialize();
        Student.initialize();
    }
}

class Student{
    private static int sum = 1;
    String name;
    int id;
    boolean isMale;
    int age;

    private Student()
    {
    }
    public static Student initialize(){
        Student student = null;
        if(sum <= 10)
        {
            student = new Student();
            System.out.println("第"+sum+"个对象创建成功");
            ++sum;
        }
        else  if(sum>10)
        {
            System.out.println("第"+sum+"个对象创建失败");
        }
        return student;
    }

}