package ex05;

public class Test {
    public static void main(String[] args) {
        //调用Peolpe类的静态方法
        People.Shout();
        //创建People对象
        People p1=new People("狗蛋",32,"男");
        //调用People对象成员方法
        p1.Speak();
        //创建Food对象
        Food f1=new Food("蒜香排骨","咸口的");
        //调用EatFood方法,将食物对象传入其中
        p1.EatFood(f1);
    }
}
