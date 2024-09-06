package Patterns;
import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter rows");
        int rows=sc.nextInt();
        Pattern(rows);

    }
    static void Pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int t=0;t<n-i;t++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                if(j==1 || j%2!=0)
                System.out.print("1");
                else if(j%2==0)
                {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}
