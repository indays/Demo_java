package learnSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyHashSet {


    public static void main(String[] args) {

        test01();
    }



    public static void test01(){

        // 初始化Set容器
        Set<Integer> set01 = new HashSet(Arrays.asList(new int[]{1, 2, 3}));

        Set<Integer> set02  = Stream.of(1).collect(Collectors.toSet());

        Set<Integer> set03 = new HashSet<>();

        // 新增容器数据
        set01.add(4);

        // 删除容器数据
        set01.remove(4);

        // 判断元素是否在容器存在
        set01.contains(4);

        // 清除容器数据
        set01.clear();




    }
}
