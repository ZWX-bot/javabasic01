package com.homework;

public class Day09Javaobject03 {
    public static void main(String args[]){
        Rectangle rectangle = new Rectangle();
        rectangle.setCircumference(10);
        rectangle.setSquare(6);
        rectangle.draw();
        System.out.println("矩形的面积为："+rectangle.getSquare()+" 矩形的周长为："
                +rectangle.getCircumference());
        Circle circle = new Circle();
        circle.setCircumference(6);
        circle.setSquare(3);
        circle.draw();
        System.out.println("圆形的面积为："+circle.getSquare()+" 圆形的周长为："
                +circle.getCircumference());
        Triangle triangle = new Triangle();
        triangle.setCircumference(15);
        triangle.setSquare(6);
        triangle.draw();
        System.out.println("三角形的面积为："+triangle.getSquare()+" 三角形的周长为："
                +triangle.getCircumference());
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
class Rectangle extends Geometric {
    private int square;
    private int circumference;
    public void draw(){
        System.out.println("画一个矩形");
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
class Circle extends Geometric {
    private int square;
    private int circumference;
    public void draw(){
        System.out.println("画一个圆形");
    }
    public Circle(){};
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
class Triangle extends Geometric {
    private int square;
    private int circumference;
    public void draw(){
        System.out.println("画一个三角形");
    }
    public Triangle(){};
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

