public class Task7 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("World");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


