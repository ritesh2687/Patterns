package Patterns;


import java.util.Scanner;

public class Pattern4 {
    
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
    for(int j=1;j<=i+1;j++)
    {
        System.out.print(j+" ");
    }
    System.out.println("");
   }
    }
}


