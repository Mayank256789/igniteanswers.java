public class Task10 extends Thread{
    public void run(){
        for(int i=5; i>0; i--){
            System.out.println(i);
            System.out.println("In task 10");
            try {
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
