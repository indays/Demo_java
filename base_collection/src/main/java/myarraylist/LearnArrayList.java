package myarraylist;


import sun.misc.Unsafe;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class LearnArrayList {


    public void domo(){

        List<String> arr = new ArrayList();

        List arr1 = Arrays.asList();

        List<String> colors = Stream.of("blue", "red", "yellow").collect(toList());

        //arr.add();




        // ArrayList 底层Object数组 默认出参数初始化ArrayList 不会创建Object数据, 在第一次添加数据时，ArrayList 数量扩容
        // add ->    -> grow
        //
        Vector<String> vector = new Vector<String>();
        vector.add("1");
        vector.add("2");





    }


    public void domo01(){

        List<Integer> list = new LinkedList();

        list.add(1);

        list.remove(1);


        for (Integer i : list) {
            System.out.println(i);
        }


    }


}
