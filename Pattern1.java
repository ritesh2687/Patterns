package Patterns;
// package java_programs.Patterns.Pattern1;
import java.util.*;
public class Pattern1 {
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
    for(int j=0;j<n;j++)
    {
        System.out.print("# ");
    }
    System.out.println("");
   }
    }
}
