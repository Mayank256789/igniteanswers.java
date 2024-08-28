import java.util.Scanner;

public class Multiplicationofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int value = 1;
        int[] arr = new int[number];

        for (int i = 0; i < number; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < number; i++) {
            value *= arr[i];
        }

        System.out.println(value);
        sc.close();
    }
}

