package com.homework;


public class Javaobject01 {
    public static void main(String args[]){
        Student stu1 = new Student("张三",18,true,1);
        Student stu2 = new Student("李四",25,false,2);
        //然后在两个对象上调用print()方法即
        stu1.print();//执行结果：张三---18---男---1
        stu2.print();//执行结果：李四---25---女---2
        MyStudent st = new MyStudent();
        st.print();
    }
}

class Student{
    String name;
    int age;
    boolean isMale;
    int sno;
    //初始化name成员变量值的1参构造方法
    public Student(String name){
        this.name = name;
    }
    //初始化name 和 sno两个成员变量值的2参构造方法
    public Student(String name,int sno){
        this.name = name;
        this.sno = sno;
    }
    //初始化name，age，isFimale三个成员变量值的3参构造方法
    public Student(String name,int age,boolean isMale){
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }
    //初始化name，age， isMale，sno这4个成员变量值的4参构造方法
    public Student(String name,int age,boolean isMale,int sno){
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.sno = sno;
    }
    public void print()
    {
        System.out.println(name + "---" + age + "---" + (isMale ? "男" : "女") + "---" + sno);
    }
}

class MyStudent{
    String name;
    int age;
    boolean isMale;
    int sno;
    //初始化name成员变量值的无参构造方法
    public MyStudent(){
        this("麻花疼",100,true,1000);
    }
    //初始化name 和 sno两个成员变量值的2参构造方法
    public MyStudent(String name,int sno){
        this.name = name;
        this.sno = sno;
    }
    //初始化name，age，isFimale三个成员变量值的3参构造方法
    public MyStudent(String name,int age,boolean isMale){
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }
    //初始化name，age， isMale，sno这4个成员变量值的4参构造方法
    public MyStudent(String name,int age,boolean isMale,int sno){
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.sno = sno;
    }
    public void print()
    {
        System.out.println(name + "---" + age + "---" + (isMale ? "男" : "女") + "---" + sno);
    }
}