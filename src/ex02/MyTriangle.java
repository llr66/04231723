package ex02;

public class MyTriangle {
    public static void main(String[] args) {
        //技术有限,先上4层循环
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <= 4-i; j++) {
                System.out.print(" ");
            }
            for (int j = 6; j <=4+2*i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //下3层循环
        for (int i = 1; i <=3 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=7-2*i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
