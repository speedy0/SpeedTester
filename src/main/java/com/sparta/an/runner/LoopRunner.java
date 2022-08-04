package com.sparta.an.runner;

import com.sparta.an.loops.Loopable;

public class LoopRunner {
    // Dependency Injection
    public void runLoops(Loopable loop, int maxVal){
        double startTime = System.nanoTime();
        loop.runLoop(maxVal); //Liskov - children implement runLoop.
        double endTime = System.nanoTime();
        double totalTime = endTime - startTime;
        System.out.println("Time in miliseconds: " + (totalTime / 1000000) + ", ");

        /*
        long start = System.nanoTime();

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        long end = System.nanoTime();

        System.out.println("Time took " + ((end - start) / 1000000)); */
    }
}
