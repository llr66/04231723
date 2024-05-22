package ex02;

import java.util.Scanner;
public class IntegerCompute {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //输入第一个数值
        System.out.println("输入第一个数值");
        int n1=sc.nextInt();
        //输入字符
        System.out.println("输入运算字符(+-*/)");
        char sign=sc.next().charAt(0);
        //输入第二个数值
        System.out.println("输入第二个数值");
        int n2=sc.nextInt();

        String sign1=String.valueOf(sign);//转换为String方便调方法比较
        switch (sign1.equals("+")?1:sign1.equals("-")?2:sign1.equals("*")?3:sign1.equals("/")?4:5){
            case 1:
                System.out.println(n1+"+"+n2+"="+(n1+n2));
                break;
            case 2:
                System.out.println(n1+"-"+n2+"="+(n1-n2));
                break;
            case 3:
                System.out.println(n1+"*"+n2+"="+(n1*n2));
                break;
            case 4:
                System.out.println(n1+"/"+n2+"="+(n1/n2));
                break;
            case 5:
                System.out.println("无效运算符");
                break;
        }
    }
}
