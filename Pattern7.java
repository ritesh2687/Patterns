package Patterns;
import java.util.Scanner;

public class Pattern7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("define the number of row ");
    int row = sc.nextInt();
    pattern(row);
  }

  static void pattern(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 1; j <= n; j++) {
        if (j > i) {
          System.out.print("#");
        } 
      }
        System.out.println("");
      
    }
  }
}
