package com.cskaoyan.homework;
//请设计类，描述一系列的Geometric，包括矩形，圆形，三角形。
//1. 这些图形都有面积，周长两种属性
//2. 这些图形，都可以被画出来(输出或打印出来，即都有一个draw方法)
//请定义类，来描述以上几何图形，并考虑类中成员变量的访问权限，并提供必要的方法进行属性(成员变量的)访问。
public class Day09Javaobject03 {
    public static void main(String args[]){
        Rectangl rectangl = new Rectangl();

    }
}
abstract class Geometric{
    private int square;
    private int circumference;
    public abstract void draw();
    public Geometric(){};
    public Geometric(int square,int circumference){
        this.circumference = circumference;
        this.square = square;
    }
    public int getCircumference() {
        return circumference;
    }
    public int getSquare(){
        return square;
    }
    public void setSquare(int square){
        this.square = square;
    }
    public void setCircumference(int circumference){
        this.circumference = circumference;
    }
}
class Rectangle extends Geometric{
    private int square;
    private int circumference;
    public void draw(){
        System.out.println("画一个矩形");
    }
    public Rectangle(int square,int circumference){
        this.circumference = circumference;
        this.square = square;
    }
    public int getCircumference() {
        return circumference;
    }
    public int getSquare(){
        return square;
    }
    public void setSquare(int square){
        this.square = square;
    }
    public void setCircumference(int circumference){
        this.circumference = circumference;
    }
}
class Circle extends Geometric{
    private int square;
    private int circumference;
    public void draw(){
        System.out.println("画一个圆形");
    }
    public Circle(int square,int circumference){
        this.circumference = circumference;
        this.square = square;
    }
    public int getCircumference() {
        return circumference;
    }
    public int getSquare(){
        return square;
    }
    public void setSquare(int square){
        this.square = square;
    }
    public void setCircumference(int circumference){
        this.circumference = circumference;
    }
}
class Triangle extends Geometric{
    private int square;
    private int circumference;
    public void draw(){
        System.out.println("画一个三角形");
    }
    public Triangle(int square,int circumference){
        this.circumference = circumference;
        this.square = square;
    }
    public int getCircumference() {
        return circumference;
    }
    public int getSquare(){
        return square;
    }
    public void setSquare(int square){
        this.square = square;
    }
    public void setCircumference(int circumference){
        this.circumference = circumference;
    }
}
