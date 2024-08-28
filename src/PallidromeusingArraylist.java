import java.util.ArrayList;
import java.util.Scanner;

public class PallidromeusingArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        boolean isPalindrome = true;
        for (int i = 0; i < n / 2; i++) {
            if (!list.get(i).equals(list.get(n - i - 1))) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
