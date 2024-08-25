import java.util.Scanner;

public class Shiftelement0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int [] arr = new int [num];
        int position = 0;
        int [] positions = new int [num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < num; i++) {
                System.out.println(arr[i]);
        }
        for (int i = 0; i < num; i++) {
            if(arr[i]  != 0) {
                arr[position] = arr[i];
                position++;
            }
        }
        while(position <num){
            arr[position] = 0;
        }

        for(int i =0;i<num;i++){
            System.out.println(arr[i] + " ");
        }
    }
}
