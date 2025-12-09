class BMSCERunnable implements Runnable {
    public void run() {
        try {
            for (int i=1;i<6;i++){
                System.out.println("BMS College Of Engineering");
                Thread.sleep(10000); // 10 seconds
            }
        } catch (InterruptedException e) {
            System.out.println("BMSCE thread interrupted");
        }
    }
}

class CSERunnable implements Runnable {
    public void run() {
        try {
            for (int i=1;i<6;i++) {
                System.out.println("CSE");
                Thread.sleep(2000); // 2 seconds
            }
        } catch (InterruptedException e) {
            System.out.println("CSE thread interrupted");
        }
    }
}

public class TwoThreads {
    public static void main(String[] args) {
        Thread t1 = new Thread(new BMSCERunnable());
        Thread t2 = new Thread(new CSERunnable());

        t1.start();
        t2.start();
    }
}
