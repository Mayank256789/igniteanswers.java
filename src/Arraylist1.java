import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < N; i++) {
            list.add(scanner.nextInt());
        }
        System.out.println(list);
        for (int i = 0; i < N; i++) {
            if (list.get(i) != 0) {
                list1.add( list.get(i));
                count++;
            }
        }
        //System.out.println(count);
       // System.out.println(list1);
        while(count < list.size()) {
        list2.add(0);
        count++;
    }
       // System.out.println(list2);
        list3.addAll(list2);
        list3.addAll(list1);
        //System.out.println(list3);
        Collections.sort(list3);
        System.out.println(list3);
    }
}
