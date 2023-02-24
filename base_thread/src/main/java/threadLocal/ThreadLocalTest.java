package threadLocal;

import java.util.logging.SimpleFormatter;

public class ThreadLocalTest implements Runnable {

    private static final ThreadLocal<SimpleFormatter> formatter = ThreadLocal.withInitial(() -> new SimpleFormatter());

    @Override
    public void run() {

    }
}
