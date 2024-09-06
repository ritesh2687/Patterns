package Patterns;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       
        System.out.println("enter no of rows");
        int num=sc.nextInt();
        Pattern(num);
    }
static void Pattern(int n)
{
   
    for(int i=0;i<n;i++)
    {
         for(int t=n-i;t>0;t--)
        {
        System.out.print(" ");
        }   
    for(int j=0;j<=i;j++)
    
    {
       
        System.out.print(" #");
    }


    
    System.out.println();
    }


}    
}

