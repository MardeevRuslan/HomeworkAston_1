package mardeev.homework1.twothreads;

public class TwoThreads {

    private  int count = 0;


    public void run() {
        Thread egg = new Thread(() -> {
            while (count < 100) {
                try {
                    synMetod("Egg");
                    count++;
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread hen = new Thread(() -> {
            while (count < 100) {
                try {
                    synMetod("Hen");
                    count++;
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        egg.start();
        hen.start();
    }

    private synchronized void synMetod(String who) {
        System.out.println(who);
    }
}
