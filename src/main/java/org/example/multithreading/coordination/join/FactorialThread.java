package org.example.multithreading.coordination.join;

import java.math.BigInteger;

public class FactorialThread extends Thread {

    private boolean isComplete;
    private BigInteger result = BigInteger.ZERO;
    private long inputNumber;


    public FactorialThread(long inputNumber) {
        this.inputNumber = inputNumber;
    }

    public boolean isComplete() {
        return this.isComplete;
    }

    public BigInteger getResult() {
        return this.result;
    }

    public long getInputNumber() {
        return inputNumber;
    }

    @Override
    public void run() {
        this.result = factorial(inputNumber);
        this.isComplete = true;
    }

    private BigInteger factorial(long inputNumber) {

        BigInteger tempResult = BigInteger.ONE;

        for (long i = inputNumber; i > 0; i--) {
            tempResult = tempResult.multiply(BigInteger.valueOf(i));
        }
        return tempResult;
    }
}
