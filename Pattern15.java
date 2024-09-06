package Patterns;
import java.util.Scanner;

public class Pattern15 {
       public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number of rows");
        int coloums=sc.nextInt();
        Pattern(coloums);
    
       }
       static void Pattern(int n)
       {if (n%2==0)
        { n=n+1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
              if(i+j==n/2 ||i-j==n/2 ||i+j==((n-1)/2)+n-1 || j-i==(n-1)/2)
              {System.out.print("#");
            }
              else
              {
                System.out.print(" ");
              }
            }
            System.out.println();
        }
    }
       }
}
