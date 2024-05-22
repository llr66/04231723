package ex08;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //控制台输入三边
        double x= sc.nextDouble();
        double y= sc.nextDouble();
        double z= sc.nextDouble();
        //创建三角形对象
        Triangle t1=new Triangle(x,y,z);
        //展示三角形
        t1.showInfo();
    }
}
