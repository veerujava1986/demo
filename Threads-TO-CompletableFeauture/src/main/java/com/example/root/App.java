package com.example.root;

import com.sun.xml.internal.ws.util.CompletedFuture;

import java.util.concurrent.*;
import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ExecutionException, InterruptedException {


        Callable<String> task1=()->{
            System.out.println("inside task1");
            try {
                Thread.sleep(3000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "task1";
        };


        Runnable task2=()-> System.out.println("task2");
        Runnable task3=()-> System.out.println("task3");
        Runnable task4=()-> System.out.println("task4");
        Runnable task5=()-> System.out.println("task5");


        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Future<String> future = executorService.submit(task1);
        while (!future.isDone()){

            System.out.println(future.get());
        }


        executorService.execute(task2);
        executorService.execute(task3);
        executorService.execute(task4);
        executorService.execute(task5);

        CompletableFuture<String> completableFuture =new CompletableFuture<>();
        completableFuture.complete("hello");


        String s = completableFuture.get();
        System.out.println("xxxx"+s);




    }
}
