package mycurrenthashmap;

import java.util.concurrent.ConcurrentHashMap;

public class LearnCurrentHashMap {


    public void domo(){

        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        // jdk1.7 currentHashMap 由segment 数组组成。每个segment都是一个HashMap, 每个数组都是由Synchronized 方法修饰

        //  jdk 1.8 之后 currentHashMap进行了优化

        //通过乐观锁的机制来实现现场安全   CAS   比较与交换算法    unsafe sawp（）   底层来用C++
    }



}
