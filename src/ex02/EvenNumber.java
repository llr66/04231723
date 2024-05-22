package ex02;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//输入n的值
        for (int i = 1; i <= n; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
