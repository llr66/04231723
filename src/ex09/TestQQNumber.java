package ex09;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class TestQQNumber {
    public static void main(String[] args) {
        String[] strs={"12345","67891","12347809933","98765432102","67891","12347809933","67891"};
        List<String> list = Arrays.asList(strs);
        //先转换为HashSet去重
        LinkedList<String> list1 = new LinkedList<>(new HashSet<>(list));

        for (String s : list1) {
            System.out.println(s);
        }
    }
}