package Patterns;
import java.util.Scanner;

public class Pattren5 {
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
    for(int j=0;j<=i;j++)
    {
        System.out.print("# ");
    }
    System.out.println("");
   }
   for(int i=0;i<n-1;i++)
   {
    for(int j=n-i-1;j>0;j--)
    {
        System.out.print("# ");
    }
    System.out.println("");
   }
    }
}

