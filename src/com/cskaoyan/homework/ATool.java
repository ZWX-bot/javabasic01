package com.cskaoyan.homework;

public class ATool {
    public static void main(String args[]){
        int[] a = new int[]{1,9,4,3,2,5,4,6,9};
        int max = ArrayTool.max(a);
        int min = ArrayTool.min(a);
        int firstIndex = ArrayTool.Find(a, 9);
        System.out.println("元素9第一次出现在数组中的序号（数组下标）："+firstIndex);
        int lastIndex = ArrayTool.findLast(a, 4);
        System.out.println("元素4最后出现在数组中的序号（数组下标）："+lastIndex);
        System.out.println("数组最大值："+max);
        System.out.println("数组最小值："+min);
        System.out.print("数组初始顺序：");
        for(int i = 0;i< a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        ArrayTool.nizhi(a);
        System.out.print("数组逆置顺序：");
        for(int i = 0;i< a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

    }
}
class ArrayTool{
    //最大值
    public static int max(int[] a){
        int max = a[0];
        for(int i = 1; i < a.length ;++i)
        {
            if(a[i]>max)
            {
                max = a[i];
            }
        }
        return  max;
    }
    //最小值
    public static int min(int[] a){
        int min = a[0];
        for(int i = 1; i < a.length ;++i)
        {
            if(a[i]<min)
            {
                min = a[i];
            }
        }
        return  min;
    }
    //逆置数组元素
    public static void nizhi(int[] a){
        int tmp;
        for (int i = 0; i < a.length/2; i++) {
            tmp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = tmp;
        }
    }
    //查表
    public static int Find(int[] a,int n){
        for(int i = 1; i < a.length ;++i)
        {
            if(a[i]==n)
            {
                return i;
            }
        }
        return  -1;
    }
    //最后出现的索引
    public static int findLast(int[] a,int value) {
        int index=-999;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == value) {
                index = i;
            }
        }
        return index;
    }
}
