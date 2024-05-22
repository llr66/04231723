package ex10.test03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

class Book implements Comparable{ //实现接口Comparable
    private String no,name;
    private double price;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book(String no, String name, double price) {
        this.no = no;this.name = name; this.price = price;
    }
    @Override
    public String toString() {
        return no + ":" + name + ":" +price;
    }
    @Override
    public int compareTo(Object o) {
//先按no从小到大比较，再按price由高到底比较
        Book book=(Book) o;
        if (this.no.compareTo(book.no)!=0){
            return this.no.compareTo(book.no);
        }else {
            return Double.compare(this.price, book.price);
        }
//添加代码

    }
}
public class CompareBooksDemo {
    public static void main(String[] args) {
//先创建至少4个Book对象
        Book book1=new Book("1","老人与海鲜",23);
        Book book2=new Book("2","老人与烧烤",33);
        Book book3=new Book("3","老人与海苔",45);
        Book book4=new Book("4","老人与海怪",34);
        Book book5=new Book("4","老人与海胆",23);
//将它们放入一个ArrayList中，输出
        List<Book> booksArrList=new ArrayList<>();
        Collections.addAll(booksArrList,book1,book2,book3,book4,book5);
//进行排序，再输出
        TreeSet<Book> ts=new TreeSet<>();
        ts.addAll(booksArrList);
        for (Book t : ts) {
            System.out.println(t);
        }
//添加代码

    }
}
