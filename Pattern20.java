package Patterns;
import java.util.Scanner;

public class Pattern20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no of rows");
    int row = sc.nextInt();
    Pattern(row);
  }

  static void Pattern(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {

        if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
          System.out.print("#");
        } else if ((i > 0 && i < n - 1) && (j > 0 && j < n - 1)) {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
