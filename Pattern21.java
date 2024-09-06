package Patterns;
import java.util.Scanner;

public class Pattern21 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter number of rows");
      int rows = sc.nextInt();
      Pattern(rows);
   }

   static void Pattern(int n) {
      int t = 1;
      for (int i = 0; i <= n; i++) {
         for (int j = 0; j < i; j++) {
            System.out.print(" "+t);
            ++t;
         }
         
         System.out.println();
      }
   }
}