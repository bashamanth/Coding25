package org.example.educative.concurrency.SecondChapter;

import java.util.Random;

public class DemoThreadUnsafe {

    static Random random = new Random(System.currentTimeMillis());

    public static void main(String[] args) throws InterruptedException {
        ThreadUnsafeClass threadUnsafeClass = new ThreadUnsafeClass();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    threadUnsafeClass.increment();
                    DemoThreadUnsafe.sleepRandmoly();

                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    threadUnsafeClass.decrement();
                    DemoThreadUnsafe.sleepRandmoly();
                }
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        threadUnsafeClass.printCount();
    }

    static void sleepRandmoly(){
        try {
            Thread.sleep(random.nextInt(10));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
