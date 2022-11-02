package com.example.root;

import org.springframework.boot.CommandLineRunner;

/**
 * Hello world!
 *
 */
public class App implements CommandLineRunner {
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Jetty Started..........................");
    }
}
