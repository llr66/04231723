package ex02;

import java.util.Scanner;

public class MyFactorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//输入n的值
        int num=1;//n!的记录num
        for (int i = 1; i <=n ; i++) {
            num*=i;
        }
        System.out.println(n+"!="+num);
    }

}
