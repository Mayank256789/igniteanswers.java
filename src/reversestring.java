import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int N = scanner.nextInt();
        int bitcount =  Integer.toBinaryString(N).length();
        int bitmask = (1<< bitcount) - 1;
        int result  = N ^ bitmask;
        System.out.println(result);
    }
}
