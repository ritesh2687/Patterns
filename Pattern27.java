import java.util.Scanner;
public class Pattern27 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows=sc.nextInt();
        Pattern(rows);
    }
    static void Pattern(int n)
    {int b=1;
    for(int i=0;i<2*n;i++)
    {
            for(int j=0;j<n;j++)
            {
                if(i-j>=1 && i+j<=2*n-2)
                {
                    System.out.print(" &");
                    b--;
                }
                else{
                    
                    System.out.print(" "+(b));
              
                }
                b++; 
            }
            
            
            System.out.println();
        }
    }
}