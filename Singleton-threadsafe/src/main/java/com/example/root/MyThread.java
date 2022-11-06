package com.example.root;

public class MyThread implements Runnable{

    @Override
    public void run() {
        try {
            MySingleton s=MySingleton.getSingleton();
            System.out.println(Thread.currentThread().getName()+" "+s.hashCode());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
