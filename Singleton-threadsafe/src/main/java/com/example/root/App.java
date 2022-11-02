package com.example.root;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        MyThread t=new MyThread();
        executorService.execute(t);
        executorService.execute(t);
        executorService.execute(t);
        executorService.execute(t);
        executorService.execute(t);
        executorService.execute(t);




    }
}
