package threadExample;

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
    }


    public static void test02(){

    }
}
