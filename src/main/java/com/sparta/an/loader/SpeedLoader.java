package com.sparta.an.loader;

import com.sparta.an.loops.ForLoopRunner;
import com.sparta.an.loops.StreamLoopRunner;
import com.sparta.an.loops.WhileLoopRunner;
import com.sparta.an.runner.LoopRunner;

public class SpeedLoader {
    public static void startLoops(int maxVal){
        ForLoopRunner forLoopRunner = new ForLoopRunner();
        WhileLoopRunner whileLoopRunner = new WhileLoopRunner();
        StreamLoopRunner streamLoopRunner = new StreamLoopRunner();
        LoopRunner runner = new LoopRunner();

        runner.runLoops(forLoopRunner, maxVal);
        runner.runLoops(whileLoopRunner, maxVal);
        runner.runLoops(streamLoopRunner, maxVal);
    }
}
