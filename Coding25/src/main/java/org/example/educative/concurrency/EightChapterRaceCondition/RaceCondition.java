package org.example.educative.concurrency.EightChapterRaceCondition;

import java.util.Random;

public class RaceCondition {
    int randInt;

    Random random = new Random(System.currentTimeMillis());
    public void printer() {
        int i=1000000;

        while (i!=0){
            if(randInt %5 ==0){
                if(randInt %5 !=0){
                    System.out.println(randInt);
                }
            }
            i--;
        }
    }

    public void modifier() {
        int i=1000000;

        while (i!=0){
            randInt=random.nextInt(1000);
            i--;
        }
    }
}
