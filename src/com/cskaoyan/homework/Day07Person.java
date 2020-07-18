package com.cskaoyan.homework;
//
//c. 声明一个Teacher类，继承自Person类，增加course属性（教学课程）
//  通过构造方法进行赋值，有一个方法，可以显示姓名性别年龄教学课程信息
//
//d.编写一个测试类，验证你的代码.(分别创建Student对象，和Teacher对象，
//  要求利用子类对象的显示初始化，即在子类构造方法中，调用父类构造方法的方式
//  来初始化子类对象。)
public class Day07Person {
    public static void main(String args[]){
        //Person person = new Person("ZS",true,28);
       // person.display();
        StudentS student = new StudentS("lisi",false,17,1);
        student.display();
        Teacher teacher = new Teacher("zs",true,27,"数学");
        teacher.display();
    }
}
//a. 声明一个Person类，里面定义了三个属性，name、gender、age（姓名、性别、年龄）
//  通过构造方法进行赋值。有一个display方法，可以展示对应的姓名性别年龄信息
class Person{
    String name;
    boolean gender;
    int age;
    public Person(String name,boolean gender,int age){
        this.age = age;
        this.gender = gender;
        this.name = name;
    }
    public void display(){
        System.out.print("姓名:"+this.name);
        System.out.print("  性别:"+(this.gender?"男":"女"));
        System.out.println("  年龄:"+this.age);
    }
}
//b. 声明一个Student类，继承自Person类，增加一个独特的属性id（学号）
//  通过构造方法进行赋值，同时有一个方法可以展示姓名性别年龄学号信息
class StudentS extends Person{
    int id;
    public StudentS(String name,boolean gender,int age,int id){
        super(name, gender, age);
        this.id = id;
    }
    public void display(){
        System.out.print("姓名:"+this.name);
        System.out.print("  性别:"+(this.gender?"男":"女"));
        System.out.print("  年龄:"+this.age);
        System.out.println("  学号:"+this.id);
    }

}
//c. 声明一个Teacher类，继承自Person类，增加course属性（教学课程）
//  通过构造方法进行赋值，有一个方法，可以显示姓名性别年龄教学课程信息
 class Teacher extends Person{
    String course;

    public Teacher(String name, boolean gender, int age, String course) {
        super(name, gender, age);
        this.course = course;
    }

    public void display(){
        System.out.print("姓名:"+this.name);
        System.out.print("  性别:"+(this.gender?"男":"女"));
        System.out.print("  年龄:"+this.age);
        System.out.println("  课程:"+this.course);
    }
}