import java.util.ArrayList;
import java.util.Scanner;

public class Arraylists {
    public static void main(String[] args) {
        /*ArrayList<String> list = new ArrayList<String>();
        list.add("M");
        list.add("A");
        list.add("Y");
        list.add("A");
        list.add("N");
        list.add("K");
        System.out.println(list);
        list.add(1,"K");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.remove("M");
        System.out.println(list);*/

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(7);
        list.add(11);
        list.add(15);
        System.out.println(list);
        int target = 9;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) + list.get(i + 1) == target) {
                System.out.println("Pair found: " + (i) + " " + (i + 1));
            }

        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int value = sc.nextInt();
            list.add(value);
        }
        System.out.println(list);
    }
}
