package threadExample;

import java.util.concurrent.FutureTask;

public class ThreadCreateTest {


    public static void main(String[] args) {


    }

    public void test01(){

        // Thread创建线程
        MyThread myThread = new MyThread();
        myThread.start();

        // Callable
        MyCallable callable = new MyCallable();
        FutureTask<Integer> futureTask = new FutureTask<>(callable);

        Thread mycallThread = new Thread(futureTask);



    }

}
