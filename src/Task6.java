public class Task6 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println("Hello");
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }

        }

    }

}
