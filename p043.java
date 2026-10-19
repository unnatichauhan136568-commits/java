class LoopThread extends Thread {
    private String threadName;

    public LoopThread(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        System.out.println(threadName + " started executing.");
        for (int i = 1; i <= 3; i++) {
            System.out.println(threadName + " Loop Count: " + i);
            try {
                Thread.sleep(300); // Pause for 300ms to simulate work
            } catch (InterruptedException e) {
                System.out.println(threadName + " was interrupted.");
            }
        }
        System.out.println(threadName + " finished execution.");
    }
}

public class p043 {
    public static void main(String[] args) {
        System.out.println("Main thread started.");

        LoopThread t1 = new LoopThread("Thread-1");
        LoopThread t2 = new LoopThread("Thread-2");

        
        t1.start();

        try {
           
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        
        t2.start();

        try {
            // 4. Main thread waits until t2 completely finishes its loop
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread finished.");
    }
}