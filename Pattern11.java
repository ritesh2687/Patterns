package Patterns;
import java.util.Scanner;
public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows");
        int num=sc.nextInt();
        Pattern(num);
    }
    static void Pattern(int n)
    {
        for(int i=0;i<n;i++)
        {  
            int t=0;
            for (t=0;t<i;t++)
            {
                System.out.print(" ");
            }

        
            for(int j=(n-i);j>0;j--)
            {
            System.out.print(" #");
            }
            System.out.println();
        }
    }
}

