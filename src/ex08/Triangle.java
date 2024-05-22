package ex08;

public class Triangle {
    //三角形的三边长
    private double x,y,z;
    public Triangle() {
    }
    public Triangle(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double getArea(){
        // 计算半周长
        double s = (x + y + z) / 2;
        // 使用海伦公式计算面积
        double area = Math.sqrt(s * (s - x) * (s - y) * (s - z));
        return area;
    }
    public void showInfo() {
        //if判断是否能组成三角形
        if (isTriangle()) {
            double area = getArea();
            System.out.println("三角形的面积为：" + area);
        } else {
            System.out.println("输入的三条边无法构成三角形");
        }
    }

    //判断三边能否组成方法
    private boolean isTriangle() {
        return (x + y > z) && (x + z > y) && (y + z > x);
    }
}
class NotTriangleException extends Exception {
    public NotTriangleException(String message) {
        super(message);
    }
}
