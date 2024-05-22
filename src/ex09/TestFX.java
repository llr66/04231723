package ex09;
//2D图像接口
interface Shape2D{
    //计算面积的方法
    public double area();
}
//圆
class Circle implements Shape2D{
    private static final double p=3.14;
    //圆的半径
    private double r;

    public Circle() {
    }
    public Circle( double r) {
        this.r = r;
    }

    //计算面积的方法
    @Override
    public double area() {
        double area= p*r*r;
        return area;
    }

    /**
     * 获取
     * @return r
     */
    public double getR() {
        return r;
    }

    /**
     * 设置
     * @param r
     */
    public void setR(double r) {
        this.r = r;
    }

    public String toString() {
        return "Circle{p = " + p + ", r = " + r + "}";
    }
}
//矩形
class Rectangle implements Shape2D{
    //长
    private double l;
    //宽
    private double h;

    public Rectangle() {
    }

    public Rectangle(double l, double h) {
        this.l = l;
        this.h = h;
    }

    @Override
    public double area() {
        double area=h*l;
        return area;
    }

    /**
     * 获取
     * @return l
     */
    public double getL() {
        return l;
    }

    /**
     * 设置
     * @param l
     */
    public void setL(double l) {
        this.l = l;
    }

    /**
     * 获取
     * @return h
     */
    public double getH() {
        return h;
    }

    /**
     * 设置
     * @param h
     */
    public void setH(double h) {
        this.h = h;
    }

    public String toString() {
        return "Rectangle{l = " + l + ", h = " + h + "}";
    }
}
public class TestFX<T> {
    public void display(T t){
        System.out.println(((Shape2D)t).area());
    }

    public static void main(String[] args) {
        Circle circle=new Circle(10);
        Rectangle rect=new Rectangle(10,20);
        System.out.println("圆的面积: ");
        new TestFX<Circle>().display(circle);
        System.out.println("矩形面积: ");
        new TestFX<Rectangle>().display(rect);
    }
}
