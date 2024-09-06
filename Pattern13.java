package Patterns;
import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
    
    
    Scanner sc =new Scanner(System.in);
    System.out.println("enter rows");
    int row=sc.nextInt();
    Pattern(row);
    }
    
    static void Pattern(int n)
    {
        for(int i=0;i<=n;i++)
        {
            for (int j=0;j<=n+i;j++)
            {
                if(i+j==n || j-i==n  || (i==n && j%2==0)   )
                
                {System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }  
}
