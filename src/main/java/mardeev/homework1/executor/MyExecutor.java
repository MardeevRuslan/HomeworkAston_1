package mardeev.homework1.executor;

import java.util.concurrent.*;

public class MyExecutor {
    private int count =0;

    private Runnable run1 = () -> {
        while (count < 100) {
            try {
                System.out.println("run1 ");
                count++;
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    };

    private Runnable run2 = () -> {
        while(count < 100 ) {
            try {
                System.out.println("run2 ");
                count++;
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
    private Runnable run3 = () -> {
        while(count < 100 ) {
            try {
                System.out.println("run3 ");
                count++;
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
    private Runnable run4 = () -> {
        while(count < 100 ) {
            try {
                System.out.println("run4 ");
                count++;
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
    private Runnable run5 = () -> {
        while(count < 100 ) {
            try {
                System.out.println("run5 ");
                count++;
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
    public void run() {
        ExecutorService service = Executors.newFixedThreadPool(5);
        service.submit(run1);
        service.submit(run2);
        service.submit(run3);
        service.submit(run4);
        service.submit(run5);
        service.shutdown();
    }
}
