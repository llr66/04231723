package ex09;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestCard {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        for (int i = 10; i <=50 ; i+=10) {
            list.add(i);
        }
        for (Integer i : list) {
            System.out.println(i);
        }
        System.out.println("洗牌前链表中的数据");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            int n=iterator.next();
            System.out.printf("%d\t",n);
        }
        System.out.println();
        System.out.println("洗牌后,链表中的数据");
        //洗牌
        Collections.shuffle(list);
        iterator=list.iterator();
        while (iterator.hasNext()){
            int n=iterator.next();
            System.out.printf("%d\t",n);
        }
        System.out.println();
        System.out.println("向右旋转一次后,链表中的数据: ");
        //旋转
        Collections.rotate(list,1);
        iterator=list.iterator();
        while (iterator.hasNext()){
            int n=iterator.next();
            System.out.printf("%d\t",n);
        }
        System.out.println();
    }
}
