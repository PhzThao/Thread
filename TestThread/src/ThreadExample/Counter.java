package ThreadExample;

public class Counter {

    private int count = 0; 

    public synchronized void increment() throws InterruptedException {
        count++;
        
        if (count % 2 == 0) {
            System.out.println("Thread " + Thread.currentThread().getId() + ": " + count);
        }

        Thread.sleep(1000);
    }

    public int getCount() {
        return count;
    }
}
