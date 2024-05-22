package ex02;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @version 2.0
 * @演示键盘输入的两种种方式
 * @author Guoxiaoyan
 */
public class TestInput {
    /**
     * 最常用的输入的方法：用Scanner类，比较自由
     * 关于Scanner类的介绍书上没有相关内容
     * 请自行百度或查看jdk帮助文档
     * @return 返回键盘输入的字符串
     */
    public static String Input(){
        Scanner in=null;
        System.out.println("使用Scanner方法从键盘输入你的内容:");
        in=new Scanner(System.in);
        //读取键盘输入的一行（以回车换行为结束输入）
        String readLine = in.nextLine();
        in.close();
        return readLine;
    }
    /**
     * 用图形化组件的方式
     * 这种方式不能和前一种一起出现，
     * 你可以单独在主方法中调用方法三
     * @return 返回键盘输入的字符串
     *
     */
    public static String DialogInput(){
        String s=JOptionPane.showInputDialog("请输入：");
        System.out.println("your value is :"+s);
        return s;
    }

    public static void main(String[] args) {
        String input;
        input=TestInput.Input();//调用Scanner的方法
        System.out.println("使用scanner方法输入的字符串："+input);
        /**
         input=TestInput.DialogInput();//调用对话框图形化方法
         System.out.println("使用Dialog对话框输入的字符串："+input);
         */

    }

}
