package ex10;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class test02 {
    public static void main(String[] args) {
        //接收字符串
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        //将接收到的字符串转换为字符数组,然后再转换为包装类字符数组
        char[] charArray = str.toCharArray();
        Character[] characters=new Character[charArray.length];
        for (int i = 0; i <charArray.length; i++) {
            characters[i]=charArray[i];
        }
        //创建HashMap集合
        HashMap<Character,Integer> hm=new HashMap<>();
        //将字符数组挨个写入到集合中,并进行判断,如果没有重复就创建键值对,重复了就更新键值对
        for (Character character : characters) {
            if (!hm.containsKey(character)){
                hm.put(character,1);
            }
            else {
                Integer num = hm.get(character);
                num++;
                hm.put(character,num);
            }
        }
        //先获取键集合的方式进行遍历
        Set<Character> keyS = hm.keySet();
        for (Character key : keyS) {
            System.out.println("字符: "+key+" 字符数为"+hm.get(key));
        }

    }
}
