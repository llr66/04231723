package ex10.test01;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

import java.util.Set;
import java.util.function.BiConsumer;

public class PupilDataDemo {
    public static void main(String[] args) {
        Map<String, Pupil> pps = new Hashtable<>();
        //增（至少增加5条），使用集合对象名打印输出
//添加代码
        pps.put("01", new Pupil("01", "小红", 80));
        pps.put("02", new Pupil("02", "小明", 70));
        pps.put("03", new Pupil("03", "小钢", 85));
        pps.put("04", new Pupil("04", "小兰", 90));
        pps.put("05", new Pupil("05", "小美", 65));
        System.out.println(pps);
        //删除(选定任意一条记录）,使用集合对象名打印输出
//添加代码
        pps.remove("05");
        System.out.println(pps);
        //查与改（修改某一key对应的value的score）,然后使用集合对象名打印输出，验证是否修改成功
//添加代码
        pps.put("01", new Pupil("01", "小王", 95));
        System.out.println(pps);
        //按key:id进行排序输出
//添加代码
        pps.forEach(new BiConsumer<String, Pupil>() {
            @Override
            public void accept(String s, Pupil pupil) {
                System.out.println(s+":"+pupil);
            }
        });
        //用两种遍历输出（foreach循环法与Iterator遍历法）
//添加代码
        //foreach循环
        pps.forEach(new BiConsumer<String, Pupil>() {
            @Override
            public void accept(String s, Pupil pupil) {
                System.out.println("学号:" + s + pupil);
            }
        });
        //迭代器循环
        Set<String> keys = pps.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println("学号:"+key+pps.get(key));
        }
    }
}
