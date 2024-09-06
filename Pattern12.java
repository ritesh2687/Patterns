package Patterns;
import java.util.Scanner;

public class Pattern12 {
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
    for(int i=0;i<n;i++)
    {
            
        for(int t=n-i-1;t>0;t--)
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



/*     0|2|4|6|8|10|
00|    # # # # # #
01|    0# # # # #0
02|    00# # # #00
03|    000# # #000
04|    0000# #0000
05|    00000#00000
06|    00000#00000
07|    0000# #0000
08|    000# # #000
09|    00# # # #00
10|    0# # # # #0
11|    # # # # # #    
12|
*/