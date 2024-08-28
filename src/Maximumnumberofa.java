import java.util.Scanner;

public class Maximumnumberofa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the input string
        String str = scanner.nextLine();

        // Accept the value of L
        int L = scanner.nextInt();

        // Initialize the maximum number of 'a' characters found
        int maxA = 0;

        // Iterate over the string in steps of L
        for (int i = 0; i < str.length(); i += L) {
            // Get the substring of length L or the remaining characters
            String substring;
            if (i + L <= str.length()) {
                substring = str.substring(i, i + L);
            } else {
                substring = str.substring(i);
            }

            // Count the number of 'a' characters in the substring
            int countA = 0;
            for (char ch : substring.toCharArray()) {
                if (ch == 'a') {
                    countA++;
                }
            }

            // Update maxA if this substring has more 'a' characters
            if (countA > maxA) {
                maxA = countA;
            }
        }

        // Output the maximum number of 'a' characters found in any group
        System.out.println(maxA);
    }
}
