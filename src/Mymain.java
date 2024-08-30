import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Scanner;

public class Mymain {
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
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
      /* Date date = new Date();
       date.time();*/
        /*System.out.println("Enter a number");
        int N = sc.nextInt();
        ArrayLists2 list = new ArrayLists2();
        list.pass(N);*/
      /* HashSet<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(3);
        s.add(4);
        s.add(5);
        System.out.println(s);
        Calendar c = Calendar.getInstance();
        System.out.println("current year is:" + c.get(Calendar.YEAR));
        System.out.println("current month is:" + c.get(Calendar.MONTH));
        System.out.println("current day is:" + c.get(Calendar.DAY_OF_WEEK));
        System.out.println("current hour is:" + c.get(Calendar.HOUR_OF_DAY));
        System.out.println("current minute is:" + c.get(Calendar.MINUTE));
        System.out.println("current second is:" + c.get(Calendar.SECOND));

        System.out.println("current date is:" + c.getTime());
        c.add(Calendar.YEAR,4);
        System.out.println("After 4 year is:" + c.getTime());
        c.add(Calendar.YEAR,-12);
        System.out.println("Before 12 year is:" + c.getTime());
        c.add(Calendar.MONTH,2);
        System.out.println("After 2 month is:" + c.getTime());*/
     Date1 date1 = new Date1();
     date1.time();






    }
}
