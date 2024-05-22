package ex08;

import java.util.Scanner;

public class IntegerExcep {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //输入一个字符串
        String num=scanner.next();
        //转换为double类型
        Double d = Double.valueOf(num);
        try {
            if (d<0||d>100){
                throw new RuntimeException("当前数据不在(0,100)");
            }
            //捕获异常
        } catch (RuntimeException e) {
            System.out.println(e.getMessage()
            );
        }
    }
}
