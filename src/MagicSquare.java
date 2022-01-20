import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args)
    {   Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int sumOfForwardDiagonal=0,sumOfBackwardDiagonal=0;
        for(int i=0;i<n;i++)
        {
            sumOfForwardDiagonal+=arr[i][i];
            sumOfBackwardDiagonal+=arr[i][n-1-i];
        }
        if(sumOfForwardDiagonal==sumOfBackwardDiagonal)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
