package ex08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideExcep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //获取连个数
        int num1= 0;
        int num2= 0;
        try {
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            //捕获类型转化异常
        } catch (InputMismatchException e) {
            System.out.println("类型转换发送异常");
        }
        //进行相除计算
        try {
            int num3 =num1/num2;
            //捕获除数
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        }
    }
}
