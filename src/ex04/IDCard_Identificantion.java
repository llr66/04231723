package ex04;

import org.w3c.dom.ls.LSOutput;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class IDCard_Identificantion {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的身份证号");
        String number=sc.next();
        //511302200405040315
        boolean flag=judeG(number);
        System.out.println(flag);
        int age=getAge(number);
        System.out.println("年龄为"+age);
        judeSex(number);
    }
    public static boolean judeG(String number){

        if(number.startsWith("44")){
            return true;
        }
        else{
            return false;
        }
    }
    public static int getAge(String number) throws ParseException {

        SimpleDateFormat sd=new SimpleDateFormat("yyyyMMdd");
        Date bDay = sd.parse(number.substring(6, 14));
        Date toDay=new Date();
        long time=toDay.getTime()- bDay.getTime();
        return (int)(time/315576/100000);
    }
    public static void judeSex(String number){
        if(Integer.parseInt(number.substring(17,18))%2==1){
            System.out.println("这是男生");
        }
        else{
            System.out.println("这是女生)");
        }
    }
}
