package mardeev.homework1.main;

import mardeev.homework1.executor.MyExecutor;
import mardeev.homework1.twothreads.TwoThreads;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        new TwoThreads().run();
        new MyExecutor().run();
    }
}
