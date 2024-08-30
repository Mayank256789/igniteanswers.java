public class Task3  implements Runnable{
    public void run()  {
        for (int i =0 ; i<100; i++){
            if (i%2==0){
                System.out.print(i);
                System.out.println(" Implementing Task3 ");
                System.out.println("Even thread");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }

}
