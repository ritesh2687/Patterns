import java.util.Scanner;
public class Pattern26 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows = sc.nextInt();
        Pattern(rows);
    }
    static void Pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(" "+i);
            }
            System.out.println();
        }
    } 
}
