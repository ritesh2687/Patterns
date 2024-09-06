package Patterns;
import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows = sc.nextInt();
        Pattern(rows);
    }

    static void Pattern(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
              if((i+j)%2==0)
              {
                System.out.print(" "+0);
              }
              else
              System.out.print(" "+1);
                
            }
            System.out.println();
        }
    }
}