import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlist2 {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for(int i =1; i<number; i++){
            list.add(i);
        }
        System.out.println(list);
        for(int i =list.size()-1; i>=25; i--){
            list.remove(i);
        }
        System.out.println(list);

    }
}
