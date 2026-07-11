package org.example.multithreading.coordination.join;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Long> inputNumbers = Arrays.asList(0L, 3435L, 35435L, 2324L, 4656L, 23L, 5556L);

        List<FactorialThread> threads = new ArrayList<>();

        for (long inputNUmber : inputNumbers) {
            threads.add(new FactorialThread(inputNUmber));
        }

        for (FactorialThread thread : threads) {
            thread.start();
        }

        for (FactorialThread factorialThread: threads) {
            factorialThread.join();
        }

        for (FactorialThread thread : threads) {
            if (thread.isComplete()) {
                System.out.println("Factorial of :" + thread.getInputNumber() + " result: " + thread.getResult());
            } else {
                System.out.println("Factorial result is incomplete" + thread.getResult());

            }
        }

    }
}
