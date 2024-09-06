package Patterns;
import java.util.Scanner;

public class Pattern25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int row = sc.nextInt();
        Pattern(row);

    }

    static void Pattern(int n) {
        int t;
        for (int i = 0; i < n; i++) {
            for (t = n - i - 1; t > 0; t--) {
                System.out.print(" ");
            }

            for (int j = 0; j < n; j++) {
                if (i == n - 1 || i == 0 ||j==0||j==n-1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
