package com.sparta.an.loops;

public class ForLoopRunner implements Loopable{
    @Override
    public void runLoop(int maxVal) {
        int total = 0;
        for (int i = 0; i <= maxVal; i++) {
            total = total + i;
        }
        System.out.print("Total for loop runner is " + total + ", ");
    }
}
