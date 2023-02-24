package myarraylist;


import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {


    public void domo(){

        List<String> arr = new ArrayList();

        // ArrayList 底层Object数组 默认出参数初始化ArrayList 不会创建Object数据, 在第一次添加数据时，ArrayList 数量扩容


        // add -> ensureCapacityInternal  -> grow

        arr.add("2");




    }
}
