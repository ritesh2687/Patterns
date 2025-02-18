import java.util.Scanner;

public class Pattern28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows = sc.nextInt();
        pattern(rows);
    }

    static void pattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=(2*n)-1;j>=n;j--)
            {
                System.out.print("");
            }
            for(int l=n-1;l>0;i--)
            {

            }
        }
    }
}
