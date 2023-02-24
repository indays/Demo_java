package threadExample;

import java.util.concurrent.Callable;

public class MyCallable  implements Callable {
    @Override
    public Object call() throws Exception {
        return 1;
    }
}
