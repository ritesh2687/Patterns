package Patterns;
import java.util.Scanner;

public class Pattern24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows = sc.nextInt();
        Pattern(rows);
    }

    static void Pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j<n; j++) {
                if (i==j|| j==0|| j==n-1||i+j==n-1){
                System.out.print("#");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
