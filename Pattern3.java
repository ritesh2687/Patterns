package Patterns;
import java.util.Scanner;

public class Pattern3 {
    
public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number of row");
        int  row=sc.nextInt();
        pattern(row);
    }
    static void pattern(int n)
    {
   for(int i=0;i<n;i++)
   {
    for(int j=n-i;j>0;j--)
    {
        System.out.print("# ");
    }
    System.out.println("");
   }
    }
 
}
