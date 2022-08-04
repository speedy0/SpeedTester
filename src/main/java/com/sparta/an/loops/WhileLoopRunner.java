package com.sparta.an.loops;

public class WhileLoopRunner implements Loopable{
    @Override
    public void runLoop(int maxVal) {
        int total = 0;
        int counter = 0;

        while (counter <= maxVal){
            total = total + counter;
            counter++;
        }

        System.out.print("The total for run loop is " + total + ", ");
    }
}
