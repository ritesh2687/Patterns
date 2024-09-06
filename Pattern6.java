package Patterns;


import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number of row");
        int  row=sc.nextInt();
        pattern(row);
    }
    static void pattern(int n)
    {
   for(int i=n;i>0;i--)
   {
    for(int j=1;j<=n;j++)
    {
       if(j<i)
       {
        System.out.print(" ");
       }
       else
       {
        System.out.print("#");
       }
    }
    System.out.println("");

   }

    
}
}
