class Thread1 extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Java Programming");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("C Programming");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Thread3 implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Python Programming");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class MainProgram {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread t3 = new Thread(new Thread3());

        t1.start();
        t2.start();
        t3.start();
    }
}
