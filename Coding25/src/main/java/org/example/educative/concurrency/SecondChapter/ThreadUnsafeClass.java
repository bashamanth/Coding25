package org.example.educative.concurrency.SecondChapter;

public class ThreadUnsafeClass {
    int count=0;

    void increment(){
        count++;
    }

    void decrement(){
        count--;
    }

    void printCount(){
        System.out.println(count);
    }
}
