package ex02;

import java.util.Scanner;

public class GradeIdentify {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//学生Java成绩输入
        if(n>=90){
            System.out.println("良");
        }
        else if(n>=80){
            System.out.println("中");
        } else if (n>=70) {
            System.out.println("及格");
        } else if (n>=60) {
            System.out.println("不及格");
        }
        else{
            System.out.println("不及格");
        }
    }
}
