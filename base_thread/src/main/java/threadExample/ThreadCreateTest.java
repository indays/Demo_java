package threadExample;

import sun.nio.ch.ThreadPool;

import java.util.concurrent.*;

public class ThreadCreateTest {


    public static void main(String[] args) {


    }

    public void test01() throws ExecutionException, InterruptedException {

        // Thread创建线程
        MyThread myThread = new MyThread();
        myThread.start();

        // Callable
        MyCallable callable = new MyCallable();
        FutureTask<Integer> futureTask = new FutureTask<>(callable);

        Thread mycallThread = new Thread(futureTask);
        mycallThread.run();
        System.out.println(futureTask.get());


        MyRunnable runnable = new MyRunnable();
        runnable.run();


        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new MyRunnable());



        ThreadPoolExecutor threadPoolExecutor =
                new ThreadPoolExecutor(10, 5, 10L, TimeUnit.MINUTES,
                        new LinkedBlockingDeque<>(100),Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());



    }

}
