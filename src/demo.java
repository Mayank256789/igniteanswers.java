import java.util.Arrays;
import java.util.stream.IntStream;

public class demo extends Sample {
    public static void run(){
        System.out.println("Demo hello");
    }
     public static void main (String[] args) {
        /*Sample.print();
        demo.run();
        demo.print();
        demo obj = new demo();
        obj.run();
        obj.print();
        Sample sample  = new demo ();
        sample.print();

         */
         int[] arr = {10,20,30,45,65,70,80,90};
         IntStream intStream = Arrays.stream(arr).filter(value -> value % 2 != 0);
         IntStream intStream1 = intStream.filter(value -> value % 3 == 0);
         intStream1.forEach(value -> System.out.println(value));



     }
    public static void print(){
        /// super(); nhi 
        System.out.println("Sample111111111111111111 hello");
    }
}

