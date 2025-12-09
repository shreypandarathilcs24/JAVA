class Q {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        // Wait if there is no value to consume
        while (!valueSet) {
            try {
                System.out.println("\nConsumer waiting...");
                wait();
            } catch (InterruptedException e) {  
                System.out.println("InterruptedException caught");
            }
        }
        // Once a value is available, consume it
        System.out.println("Got: " + n);
        valueSet = false;
        // Notify the producer that space is available
        notify();
        return n;
    }

    synchronized void put(int n) {
        // Wait if there is already a value to consume (can't put another one)
        while (valueSet) {
            try {
                System.out.println("\nProducer waiting...");
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
        // Once space is available, produce the value
        this.n = n;
        valueSet = true;
        System.out.println("Put: " + n);
        // Notify the consumer that a new value is available
        notify();
    }
}

class Producer implements Runnable {
    Q q;

    Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start(); // Start the producer thread
    }

    public void run() {
        int i = 0;
        while (i < 3) {
            q.put(i++);
        }
    }
}

class Consumer implements Runnable {
    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start(); // Start the consumer thread
    }

    public void run() {
        int r = 0;
        while (r < 3) {
            r = q.get();
            System.out.println("Consumed: " + r);
        }
    }
}

class PCFixed {
    public static void main(String args[]) {
        Q q = new Q(); // Create a shared queue object
        new Producer(q); // Start the producer
        new Consumer(q); // Start the consumer
        System.out.println("Press Control-C to stop.");
    }
}
