package ex10;

public class RecursiveExample {

    public static void main(String[] args) {
        int n = 5; // 要计算的第n个数
        int result = calculateAn(n);
        System.out.println("a" + n + " = " + result);
    }

    public static int calculateAn(int n) {
        // 基本情况：当n为1或2时，直接返回对应的数值
        if (n == 1) {
            return 3;
        } else if (n == 2) {
            return 8;
        }

        // 递归情况：an = 2 * an-1 + 2 * an-2
        return 2 * calculateAn(n - 1) + 2 * calculateAn(n - 2);
    }
}