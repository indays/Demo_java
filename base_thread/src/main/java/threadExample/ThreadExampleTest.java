package threadExample;

import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExampleTest {
    public static void main(String[] args)  throws Exception{
        test01();

    }
    // 多线程产生并发
    public static void test01() throws Exception{
        final int threadSize = 100;

        final CountDownLatch countDownLatch = new CountDownLatch(threadSize);

        ThreadExamples threadExamples = new ThreadExamples();

        ExecutorService executorService = Executors.newCachedThreadPool();


        for (int i = 0; i < threadSize; i++) {

            executorService.execute(()->{

                threadExamples.add();

                countDownLatch.countDown();
            });
        }

        countDownLatch.await();

        executorService.shutdown();

        System.out.println(threadExamples.getCnt());
        Arrays.asList("");


        for(String str:new String[]{"121","323"}){

            char[] chars =str.toCharArray();
            Arrays.sort(chars);

            //chars.toString()
        }


        HashMap<String, List<String>> hashMap = new HashMap<>();

        new ArrayList<>(hashMap.values());

        int [] r =new int[]{};


        Set set =new HashSet(Collections.singleton(r));

        set.add(r);






    }


    public static void test02(){

    }
}
