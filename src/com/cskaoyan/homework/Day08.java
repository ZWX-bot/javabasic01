package com.cskaoyan.homework;

public class Day08 {
    public static void main(String args[]){
        Person1 person1 = new Person1();
        person1.eat();
        Person1 person2 = new SouthPerson();
        person2.eat();
        Person1 person3 = new NorthPerson();
        person3.eat();
    }
}
class Person1{
    public void eat()
    {
        System.out.println("人要吃饭");
    }
}
class SouthPerson extends Person1{
    public void eat()
    {
        System.out.println("南方人吃炒菜和米饭");
    }
}
class NorthPerson extends Person1{
    public void eat()
    {
        System.out.println("北方人吃烩菜和馒头");
    }
}