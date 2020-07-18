package com.cskaoyan.homework;

public class Day07 {
    public static void main(String args[]){
        Square square = new Square();
        square.setEdge(4);
        System.out.println("正方形边长为："+square.getEdge()+" 正方形面积为："
                +square.area(square.getEdge())+" 正方形周长为："
                +square.circumference(square.getEdge()));
        Rectangl rectangl = new Rectangl();
        rectangl.setLength(2);
        rectangl.setWidth(3);
        System.out.println("长方形长为："+rectangl.getLength()
                +" 长方形宽为："+rectangl.getWidth() +" 长方形面积为："
                +rectangl.area(rectangl.getLength(),rectangl.getWidth())
                +" 正方形周长为："
                +rectangl.circumference(rectangl.getLength(),rectangl.getWidth()));
    }
}

class Square{
    private int edge;

    public int area(int n){
        return n*n;
    }
    public int circumference(int n){
        return 4*n;
    }

    public int getEdge() {
        return edge;
    }

    public void setEdge(int edge) {
        this.edge = edge;
    }
}

class Rectangl{
    private int length;
    private int width;

    public int area(int length,int width){
        return length*width;
    }
    public int circumference(int length,int width){
        return 2*(width+length);
    }
    public int getLength(){
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}