public class Mymain {
    public static void main(String[] args){
        /*Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Thread t1 = new Thread (task1);
        System.out.println("Priority of the thread = " + t1.getPriority());
        Thread t2 = new Thread(task2);
        System.out.println("Priority of the thread = " + t2.getPriority());
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        System.out.println("Priority of the thread = " + t1.getPriority());
        System.out.println("Priority of the thread = " + t2.getPriority());


        /*Runnable task1 = new Task1();
        Runnable task2 = new Task2();
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread (task2);
        thread1.start();
        thread2.start();*/
       /* Task1 task1 = new Runnable(); cannot be instantiated*/
         /*Runnable task3 = new Task3();
         Runnable task4 = new Task4();
         Thread thread3 = new Thread (task3);
         Thread thread4 = new Thread (task4);
         thread3.start();
         thread4.start();*/
        /*Runnable task5 = new Task5();
        Thread t5 = new Thread(task5);
        t5.start();*/

        /*Thread t6 = new Task6();

        Runnable task7 = new Task7();
        Thread t7 = new Thread(task7);
        System.out.println(t7.getState());
        System.out.println(t6.getState());
        t6.start();
        t7.start();
        System.out.println(t6.getState());
        System.out.println(t7.getState());
        while (t7.isAlive()){
            try{
                Thread.sleep(5000);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(t7.getState());
            System.out.println(t6.getState());


        }
        //System.out.println(t6.getState());
        //System.out.println(t7.getState());*/
      /* Thread task10 = new Task10();
       System.out.println(task10.getState());
       task10.start();
       task10.setPriority(Thread.MIN_PRIORITY);
       System.out.println(task10.getState());

       Runnable task9 = new Task9();

       Thread t2 =  new Thread(task9);
       System.out.println(t2.getState());
       t2.start();
       t2.setPriority(Thread.MAX_PRIORITY);
       System.out.println(t2.getState());*/
       Date date = new Date();
       date.time();




    }
}
