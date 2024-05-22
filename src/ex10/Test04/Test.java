package ex10.Test04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        //在控制台获取输入的学生信息,并将其装入List集合中
        Scanner sc=new Scanner(System.in);
        List<Student> stuList=new ArrayList<>();
        System.out.println("请输入需要记录学生姓名成绩的个数");
        int num=sc.nextInt();
        for (int i = 0; i < num; i++) {
            //循环输入学生的姓名成绩
            System.out.println("输入第"+(i+1)+"个学生的姓名");
            String name= sc.next();
            System.out.println("输入第"+(i+1)+"个学生的成绩");
            int score= sc.nextInt();
            stuList.add(new Student(name,score));
        }

        //存放进TreeSet集合使用自然排序进行排序(Student类已经实现CompareTo方法)
        TreeSet<Student> stuTS=new TreeSet<>();
        stuTS.addAll(stuList);
        for (Student stuT : stuTS) {
            System.out.println(stuT);
        }

    }
}
