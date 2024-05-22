package ex03;

import java.util.Random;
import java.util.Scanner;

public class Array {
    static Random rand = new Random();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char charArray[] = randomCharArray(10);

        System.out.println(charArray);

        System.out.println("请输入你要查找的字母");
        String s = sc.nextLine();
        char c = s.charAt(0);

        int a = charIndex(c, charArray);
        if (a == -1) {
            System.out.println("该字母不存在");
        } else {
            System.out.println("该字母在数组中的索引位置为:" + a);
        }

        arrSort(charArray);
        System.out.println(charArray);
    }

    //返回一个十个完全不同的随机字母(生成数组)
    public static char[] randomCharArray(int length) {
        char arr[] = new char[length];
        int arri[] = new int[length];
        char[] letters = getLetters();
        for (int i = 0; i < length; i++) {
            int num;

            boolean flag = false;

            //判断存入是否有重复,有重复就重写给随机
            do {
                flag = false;
                num = rand.nextInt(letters.length);
                arri[i] = num;
                for (int j = 0; j < i; j++) {
                    if (arri[j] == num) {
                        flag = true;
                        break;
                    }

                }
            } while (flag);

            arr[i] = letters[num];
        }
        return arr;
    }

    //查找字母索引位置
    public static int charIndex(char c, char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                return i;
            }
        }
        return -1;
    }
    //给字符数组按字母顺序排序
    public static void arrSort(char arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    char temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    //获取a-z字符数组
    public static char[] getLetters() {
        int a = 0;
        char letters[] = new char[26];
        for (char i = 'a'; i <= 'z'; i++, a++) {
            letters[a] = i;
        }
        return letters;
    }


}
