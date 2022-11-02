package com.example.root;

public class MySingleton {

    private static MySingleton singleton =null;
    private MySingleton(){

    }

    public static synchronized MySingleton getSingleton() throws InterruptedException {
        if(singleton ==null){

            Thread.sleep(2000);
            singleton =new MySingleton();

            return singleton;
        }else {
            return singleton;
        }
    }


}
