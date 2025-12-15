class MsgThread extends Thread {
    private String msg;
    private int interval;

    public MsgThread(String msg, int interval) {
        this.msg = msg;
        this.interval = interval;
    }

    public void run() {
        while (true) {
            System.out.println(msg);
            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}
