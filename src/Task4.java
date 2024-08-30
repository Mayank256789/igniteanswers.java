public class Task4 implements Runnable {
    public void run() {
        for(int i = 0; i < 100 ; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
                System.out.println("Implementing task4");
                System.out.println("Odd number");
            }
            try {
                Thread.sleep(3000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
