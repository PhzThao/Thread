package ThreadExample;

import ThreadExample.Counter;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        int numThreads = 3;
        int incrementsPerThread = 5;
        IncrementThread[] threads = new IncrementThread[numThreads*2]; 

        for (int i = 0; i < numThreads * 2; i++) {
            threads[i] = new IncrementThread(counter, incrementsPerThread);
            threads[i].start();
        }

        try {
            for (IncrementThread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
