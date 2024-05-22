package ex09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.function.Consumer;

class Student{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void show(){
        System.out.println("学生:("+id+","+name+")");
    }
}
public class TestCollection {
    private static Collection<Student> students=new ArrayList<>();

    public static void main(String[] args) {
        students.add(new Student(111,"jack1"));
        students.add(new Student(222,"jack2"));
        students.add(new Student(333,"jack3"));
        students.add(new Student(444,"jack4"));
        students.add(new Student(555,"jack5"));
        System.out.println(students.size());
        //增强for循环
        for (Student student : students) {
            System.out.println(student);
        }
        //forEach循环,书写匿名内部类
        students.forEach(new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                System.out.println(student);
            }
        });

        //转换数组
        Student[] stuArray = students.toArray(new Student[0]);
        //迭代器遍历
        //获取迭代器对象
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student stu = iterator.next();
            stu.show();
        }
        //删除
        students.remove(new Student(111,"jack1"));
        //清空
        students.clear();

    }
}
