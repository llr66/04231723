package ex05;
import ex05.Food;
//导入Food包方便在People中去传入Food对象
public class People {
    private String name;
    private int age;
    private String sex;

    public People(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void Speak(){
        System.out.println("大家好我叫"+name+"，我的年龄是"+age+"岁,我的性别是"+sex);
    }
    public static void Shout(){
        System.out.println("我是一个人！！！！！");
    }
    //参数接收一个食物对象，让人去吃食物，并评鉴味道
    public void EatFood(Food f){
        System.out.println("大家好我叫"+name+",我现在正在吃"+f.getName()+",他的味道是"+f.getTaste()+"的");
    }
}
