package org.example.educative.concurrency.EightChapterRaceCondition;

public class DemoRaceCondition {


    public static void main(String[] args) throws InterruptedException {
//        final RaceCondition raceCondition = new RaceCondition();

        final  OvercomeRaceCondition raceCondition = new OvercomeRaceCondition();
        Thread thread1 = new Thread(raceCondition::printer);

        Thread thread2 = new Thread(raceCondition::modifier);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

    }

}
