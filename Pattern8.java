package Patterns;
import java.util.Scanner;

public class Pattern8 {
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
    for(int j=1;j<=i*2+1;j++)
    
    {
       
        System.out.print(" #");
    }


    
    System.out.println();
    }


}    
}
