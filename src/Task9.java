public class Task9 implements Runnable  {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println("In task 9");
            try{
            Thread.sleep(500);
        }catch(InterruptedException e){
            e.printStackTrace();
            }
        }
    }
}
