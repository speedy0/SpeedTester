package com.sparta.an.loops;

import java.util.stream.IntStream;

public class StreamLoopRunner implements Loopable{
    @Override
    public void runLoop(int maxVal) {
        int total = IntStream.rangeClosed(0, maxVal)
                .sum();

        System.out.print("The total for the stream loop is " + total + ", ");
    }
}
