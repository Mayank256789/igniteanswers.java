import java.util.ArrayList;
import java.util.Scanner;

public class FindduplicateCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> list = new ArrayList<>();
        System.out.println("Enter a String:");
        String s = scanner.nextLine();

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                list.add(s.charAt(i));
            }
        }

        // Convert the list to a string
        String result = convertListToString(list);
       // System.out.println("List of consecutive duplicates: " + list);
        System.out.println( result);
    }

    // Method to convert list of characters to a string
    public static String convertListToString(ArrayList<Character> list) {
        StringBuilder result = new StringBuilder();
        for (Character c : list) {
            result.append(c);
        }
        return result.toString();
    }
}

